//wap in java to search element in a binary tree

public class BSTSearch {
    static Node root;
    public static boolean search(Node root,int key){
        //base case
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    public static void main(String[] args){
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.right.right=new Node(7);

        if(search(root,8)){
            System.out.println("Element found");
        }else{
            System.out.println("Element is not found");
        }
    }
}
