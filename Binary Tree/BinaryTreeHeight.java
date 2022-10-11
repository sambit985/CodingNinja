// Wap in java to find out Height of a tree or number of levels in a tree
class Node{
  int data;
  Node left;
  Node right;
public Node(int data){
 this.data=data;
  left=null;
  right=null;
 }
}

public class BinaryTreeHeight {
    public static int findHeight(Node root){
       if(root==null){
        return 0;
       }
       return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
    public static void main(String[] args){
        Node root=new Node(10);;
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        root.left.left.left=new Node(80);

        int output=findHeight(root);
        System.out.println(output);
    }
}
