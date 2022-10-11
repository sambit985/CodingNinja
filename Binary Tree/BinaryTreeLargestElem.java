

public class BinaryTreeLargestElem {
    Node root;
    public static int findLargest(Node root){
        //base case
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int res=root.data;
        int lefres=findLargest(root.left);
        int rigres=findLargest(root.right);
        //compare root data, left subtree data and right subtree data 
        if(res>lefres && res>rigres){
            return res;
        }else if(lefres>rigres && lefres>res){
            return lefres;
        }else{
            return rigres;
        }
    }
    public static void main(String[] args){
        BinaryTreeLargestElem tree=new BinaryTreeLargestElem();
        tree.root=new Node(1);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(70);
        tree.root.left.left.left=new Node(80);

        int output=findLargest(tree.root);
        System.out.println("The maximum element is:" + output);
    }
}
