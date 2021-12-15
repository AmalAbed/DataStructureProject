
package javaapplication3;

/**
 *
 * @author Amal
 */
public class LinkedListTest {
    public static void main(String[] args) {
      LinkedList ls = new LinkedList(new Node(12,null));
      ls.add(new Node(11,null));
      ls.add(new Node(10,null));
      ls.add(new Node(15,null));
      ls.display();
      ls.delete();
      ls.display();



    }
    
}
