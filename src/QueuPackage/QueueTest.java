
package QueuPackage;

public class QueueTest {
    public static void main(String[] args) {
        QueueClass queue = new QueueClass(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
                queue.enqueue(9);

        
    }
    
}
