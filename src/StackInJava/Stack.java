
package StackInJava;

public class Stack {
    int size;
    int[] arrayStack;
    int top = -1;
    
    public Stack(int size){
        this.size = size;
        arrayStack = new int[size]; 
    }
    
    public void push(int item){
        if(isFull()){
           System.out.println("The stack is full");
            return;
        }
        else{
        top = top+1;
        arrayStack[top] = item;
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;}
        else{
        int item = arrayStack[top];
        top = top-1;
        return item;
        }
    }
    
    public boolean isFull(){
        return (top==size-1);
    }
    public boolean isEmpty(){
        return (top == -1);
    }
}
