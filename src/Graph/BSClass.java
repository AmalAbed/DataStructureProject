
package Graph;

public class BSClass {
    Node root;
    
    public BSClass(Node root){
        this.root=root;
    }
    
   public void addNode(Node newNode,Node rootExplore){
       if(rootExplore==null){
           return;
       }
    if(newNode.value>rootExplore.value){
        if(rootExplore.RightNode == null){
            rootExplore.RightNode=newNode;
        }else{
            addNode(newNode,rootExplore.RightNode);
        }
       if(rootExplore.LeftNode == null){
            rootExplore.LeftNode=newNode;
        }else{
            addNode(newNode,rootExplore.LeftNode);
        }
    }
   }
    public void search(int value, Node rootExplore){
        if(rootExplore == null){
            System.out.println("Not found");
            return;
        } 
        if(rootExplore.value == value){
            System.out.println("found");
            return;
        }
        else if(value > rootExplore.value){
            search(value, rootExplore.RightNode);
        }
        else if(value < rootExplore.value){
            search(value, rootExplore.LeftNode);
        }
        else {
            System.out.println("Not found");
            return;
        }
   }
    
}
