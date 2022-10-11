//Wap in java to sum left leaves of a binary tree

public class BinaryTreeleftLeavesSum {
    Node root;
    //check whether root has leaf or not
public static boolean isLeaf(Node root){
    if(root==null){
        return false;
    }
    if(root.left==null && root.right==null){ //if only root.left and root.right has no child then only sum possible
        return true;
    }
    return false;
}
//Function for sum left leaves of binary tree
  public static int sumLeftLeaves(Node root){
    int total=0;
    if(root!=null){
        if(isLeaf(root.left)){
            total += root.left.data;
        }else{
            sumLeftLeaves(root.left);
            sumLeftLeaves(root.right);
        }
    }
    return total;
  }
    public static void main(String[] args){
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(5);
        root.right.right=new Node(7);
        
        int output=sumLeftLeaves(root);
        System.out.println(output);
    }
}
