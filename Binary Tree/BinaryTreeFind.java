//Wap in java to find out elements in a Binary Tree

class Node{
    int data;
    Node left, right;

    public Node(int item){
        data=item;
        left=null;
        right=null;
    }
}

class BinaryTreeFind {
     Node root;

      public static boolean findElement(Node node,int data){
        if(node==null){
            return false;
        }
        if(node.data==data){
            return true;
        }
        boolean output1=findElement(node.left,data);
        if(output1){
            return true;
        }
        boolean output2=findElement(node.right,data);
        if(output2){
            return true;
        }
        return false;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args){
        BinaryTreeFind ob3=new BinaryTreeFind();
        ob3.root=new Node(1);
        ob3.root.left=new Node(2);
        ob3.root.right=new Node(3);
        ob3.root.left.left=new Node(4);
        ob3.root.left.right=new Node(5);
        ob3.root.right.left=new Node(6);
        ob3.root.right.right=new Node(7);
        int data=9;
        // if(findElement(root,data)){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
        boolean bool=findElement(ob3.root,data);
        System.out.println(bool);
    }
}
