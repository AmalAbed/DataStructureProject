
package StackGirls;

public class StackClass {
    int[] array;
    int size;
    int top = -1;
    
    public StackClass(int size){
        this.size = size;
        array = new int[size];
    }
    
    public void push(int element){
        if(isFull()){
            System.out.println("The array is full");
        }
        else{
        top = top+1;
        array[top] = element;
      }
    }
    public boolean isFull(){
        return(top == size-1);
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("The array is Empty");
            return -1;
        }
        else{
       int element = array[top];
       top =  top-1;
       return element;  
        }
    }
    
    public boolean isEmpty(){
        return(top == -1);
    }
  
    
}
