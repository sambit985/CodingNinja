
class Node{
    int data;
    Node left, right;

    public Node(int item){
        data=item;
        left=null;
        right=null;
    }
}


//Create class to create node
public class BinaryTree{
   Node root;
//Traverse Binary Tree
  public void traverseTree(Node node){
   if(node!=null){
    traverseTree(node.left);
    System.out.print(node.data);
    traverseTree(node.right);
   }
 } 
   public static void main(String[] args){
    //Create object 
    BinaryTree ob1=new BinaryTree();
    ob1.root=new Node(1);
    ob1.root.left=new Node(2);
    ob1.root.right=new Node(3);
    ob1.root.left.left=new Node(4);
    

    System.out.println("Binary Tree");
    ob1.traverseTree(ob1.root);
   }
  
}
