
package javaapplication3;

public class LinkedList {
    Node head;
    public LinkedList(Node head){
        this.head =head;            
    }
    public void add(Node newNode){
        newNode.next = head;
        head = newNode;
    }
    
    public void delete(){
        head = head.next;
    }
    public void display(){
        Node n = head;
        while(n != null){
            System.out.println(n.value);
            n=n.next;
        }
    }
    
}
