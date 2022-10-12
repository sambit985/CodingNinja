//Wap in java to to print all the path from root to leafnode of a binary search tree

import java.util.*;

public class Root2LeafPathBST {
    static Node root;
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size()-1;i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
         //leaf
        if(root.left==null && root.right==null){
            printPath(path);
        }else{  // Non-leaf
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args){
        //int[] values={8,5,3,1,4,6,10,11,14};
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);
        printRoot2Leaf(root,new ArrayList<>());
    }
}
