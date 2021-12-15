
package QueuPackage;

public class QueueClass {
    int[] array;
    int front;
    int rear;
    int size;
    
    public QueueClass(int size){
        this.size = size;
        front = -1;
        rear = -1;
        array = new int[size];
    }
    
    public void enqueue(int item){
        if(isFull()){
            System.out.println("The array is full");
        }
        rear = rear +1;
        array[rear]= item;
        if(front == -1){
            front = 0;
        } 
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        int element = array[front];
        front = front + 1;
        return element;   
    }
    public boolean isFull(){
        return (rear == size-1);
    }
    public boolean isEmpty(){
        return (rear == -1 || front>rear);
    }
    
}
