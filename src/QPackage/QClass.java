
package QPackage;

public class QClass {
    int[] array;
    int size;
    int front;
    int rear;
    
    public QClass(int size){
        this.size = size;
        array = new int[size];
        front = -1;
        rear = -1;  
    }
    public void enqueue(int item){
        if(isFull()){
            System.out.println("The Array is full");
        }
        rear = rear+1;
        array[rear]=item;
        if(front == -1){
            front =0;
        } 
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The Array is Empty");
            return -1;
        }
        int item = array[front];
        front = front+1;
        return item;
    }
    
    
    
    
    public boolean isFull(){
        return(rear == size-1);
    }
    public boolean isEmpty(){
        return(front == -1 ||front > rear);
    }
    
}
