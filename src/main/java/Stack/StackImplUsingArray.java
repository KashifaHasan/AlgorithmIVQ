package Stack;

public class StackImplUsingArray {

    /**
     * How to implement Stack with Array List using Static Array?
     * Stack, whenever u want to perform that u have to rememberer the below operations:
     *
     * 1. Push > To enter a data (Top to down). Push the element to the top of the stack.Whenever we insert any data size will be increased by 1.
     * 2. Pop > To fetch a data (LIFO : Last In First Out) Last element we enter will be the first element to fetch.So its remove the element from the Top of the Stack. The size will be decreased by 1.
     * 3. In Stack the pointer is call Top
     * 4. We have to check the Stack isEmpty or not
     * 5. We have to check the Stack isFull or not. Lets say we have given a stack size 6 or 7, so we will check if its full or not. Depending on that we can insert the data.
     * 6. Peek : It will return the top element from the stack without removing it
     * The time complexity of all the methods that we have implemented is 0(1). Since we are performing one single operation and we have no for loop here as well.
     */

    int size;
    int arr[];
    int top; //To check what exactly the values are available on top position
    //Constructor giving what particular size you want.
    StackImplUsingArray (int size) {
        this.size = size; //initializing the particular size with this keyword
        this.arr = new int[size]; //initializing it whatever the size we are giving
        this.top = -1; //initially it we are declaring it with -1

    }

    //Now we will be creating 2 important methods

    public void push(int element){
        //so we are pushing an integer element
        //Before pushing we want to check if its full or not, if its full than no need to push
        if(!isFull()){
            //If its not full increase the top value by 1. The moment we push the value, it increase the size by 1
            top ++;
            //arr of top initially top was lets say -1 so -1 +1 = 0. So top will be 0 and whatever the push element we are writing. So pushed element is whatever the element we are passing
            arr[top] = element;
            System.out.println("Pushed Element " + element);
        }
        else {
            System.out.println("Stack is full now");
        }

    }

    //Pop means get the value. Whatever top value is available we get it and decrease the size by 1. Top is representing the index values that are present in the array.
    public int pop(){
        //If its empty no need to pop, if its filled than u have to pop it. So Empty is false and not empty will make it true
        if(!isEmpty()){
            //Whatever we have in the top we will store in this variable
            int returnedTop = top;
            //Will decrease the size also
            top --;
            System.out.println("Popped Element :"+ arr[returnedTop]);//whatever the array of returnedTop
            return arr[returnedTop];
        }else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    //We will be creating 3 methods

    public boolean isEmpty(){
//If the top equal to -1, that means its empty their is no size available.
        return top==-1;
    }

    public boolean isFull(){
        //Whatever size we are getting is full or not. If size -1 is equal to top, that means we are getting the first element of the top element. We already know our stack is full.
        //size-1==top it means that either sizes 7 and  7-1==6. If it equals to 6 this means we are getting the top position.
        return size-1 == top;
    }
    public int peek(){
        //What exactly the value is available on top
        //So we are using a if condition saying that if it is not empty return the array of top position. So top position is the peek  over here.
        if(!this.isEmpty()){
            return arr[top];
        }else{
            //In this else condition, we are saying if the stack is empty return -1
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        //We are giving the size of 10
        StackImplUsingArray stackImplUsingArray = new StackImplUsingArray(10);
        stackImplUsingArray.pop();//Since we don't inserted any value it will throw a message Stack is Empty
        System.out.println("-----------------");
        stackImplUsingArray.push(100);
        stackImplUsingArray.push(200);
        stackImplUsingArray.push(300);
        stackImplUsingArray.push(400);
        System.out.println("Peek is :"+ stackImplUsingArray.peek());//Peek doesn't delete any data it will whatever the top element is available
        System.out.println("-----------------");
        stackImplUsingArray.pop(); //So we gonna see the last element thats 400 LIFO and also the size will be decreased by 1
        System.out.println(stackImplUsingArray.isEmpty());
        System.out.println(stackImplUsingArray.isFull());
    }



}
