/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

public class BSTest {
    public static void main(String[] args) {
        Node root2 = new Node(9,null,null);
        BSClass bt = new BSClass(root2);
           // System.out.println(bt.root.value);

        for(int i=0;i<10;i++){
           Node newNode = new Node(i,null,null);
           bt.addNode(newNode, bt.root);
           // System.out.println(newNode.value);
        }
//       System.out.println(bt.root.toString());
        bt.search(1, bt.root);
    }
    
}
