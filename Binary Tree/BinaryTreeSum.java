//Wap in java to print sum of all the nodes in binary tree
class Node{
    int data;
    Node left, right;

    public Node(int data){
       this.data=data;
        left=null;
        right=null;
    }
}

public class BinaryTreeSum {
    Node root;
    public static int sumBT(Node root){
        if(root==null){
            return 0;
        }
        int smallOutput= (root.data+sumBT(root.left)+sumBT(root.right));
        return smallOutput;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(4);
        root.left.left=new Node(5);
        root.left.right=new Node(6);
        root.right.left=new Node(7);
        root.right.right=new Node(8);

        int output=sumBT(root);
        System.out.println("Sum of all the element in Binary tree is :"+output);
    }
}
