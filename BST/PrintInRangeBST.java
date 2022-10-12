//Wap in java to findout how many elements lies in between 2 elements

public class PrintInRangeBST {
    static Node root;

    //make a function for print elements present in range
    public static void printInRange(Node root,int x, int y){
     //base case
     if(root==null){
        return;
     } 
     if(root.data>=x && root.data<=y){
        printInRange(root.left,x,y);
        System.out.print(root.data+" ");
        printInRange(root.right,x,y);
     }else if(root.data>=x){
        printInRange(root.right,x,y);
     }else{
        printInRange(root.left,x,y);
     }
    }

    public static void main(String[] args){
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);

       printInRange(root,3,11);
       
    }
}
