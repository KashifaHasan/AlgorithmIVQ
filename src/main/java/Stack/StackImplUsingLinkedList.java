package Stack;

import javax.xml.soap.Node;

public class StackImplUsingLinkedList {

    /**
     * How to implement stack with Linked List using Dynamic Array?
     * Every Linked List is divided into 2 parts 1. Node and 2. Reference
     * 1. Node > Every node is divided into 2 parts one is data(i.e. value) and another one is pointer. So the pointer is always going to the next block i.e. value
     * Every block will behave like a node.
     * The  moment we enter data, the size will be increased and when we remove data it will be decreased.
     * Push ->> To insert the data in the stack
     * Pop ->> To remove the data from the stack
     */

    //Creating a node reference
    Node head;

    class Node{
        //This class will contain 2 things. 1 integer value and 2 Pointer : Pointing to the next node
        int value;
        Node next;

    }

    StackImplUsingLinkedList(){
        head = null;
    }

    //Push: Add value to the beginning of the list. Give me the integer value adding it as a param
    public void push(int value){
    //In order to push we need to create a node
        Node extraHead = head;
        //Creating the object of Node since head is just the reference
        head = new Node();
        //To fetch the value = value. So over here the node will be created and whatever the value we pass it will be entered.
        head.value = value;
        //To go to the next pointer we have to give the extraHead that we created and thats null. Once we inserted the value
        head.next = extraHead;
    }

    public int pop(){
        //If the head is null than the Stack is empty
        if(head == null){
            System.out.println("Stack is empty");
        }
        //Whatever the head.value contains give it to this value. For e.g. if it contains 10 thant value will store this data.
        int value = head.value;
        //Before returning this value, we are pointing the head = head.next
        head = head.next;
        //We are returning the value
        return value;
    }

    public static void main(String[] args) {
        //Creating the object of this class, to perform all the operations. The blank constructor will be call where my head is initialized to null
        StackImplUsingLinkedList stackImplUsingLinkedList = new StackImplUsingLinkedList();
        //Before we do anything we will check we can do pop although we didn't push anything.
        System.out.println(stackImplUsingLinkedList.pop());
        //So we are pushing value to the linked List & extra head will be created
        stackImplUsingLinkedList.push(10);

    }


}
