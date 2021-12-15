
package linkedlistPAckage;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList(new Node(17,null));
        ls.add(new Node(18,null));
        ls.add(new Node(15,null));
        ls.display();
        System.out.println("///////////");
        ls.delete();
        ls.display();
        ls.add(new Node(8,null));
        ls.display();      
    }    
}
