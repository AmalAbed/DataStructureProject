
package QPackage;

public class QTest {
    public static void main(String[] args) {
        QClass queue = new QClass(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        queue.enqueue(60);

       


    } 
}
