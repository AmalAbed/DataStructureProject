/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author Amal
 */
public class Node {
   int value;
   Node RightNode;
   Node LeftNode;
   public Node(int value,Node RightNode,Node LeftNode){
       this.value = value;
       this.RightNode = RightNode;
       this.LeftNode = LeftNode;
   }
    
}
