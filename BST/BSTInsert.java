//Wap in java to insert elements in binary search tree

public class BstInsert {
    static Node root;
  //function for insert elements
    public static Node insert(Node root,int val){
      if(root==null){
        root=new Node(val); //if root is null then insert element
        return root;  //return root
      }
      if(val<root.data){   //if element is less than root then insert in leftsubtree
        root.left=insert(root.left,val);
      }else{
        root.right=insert(root.right,val);
      }
      return root;
    }
    //traverse in order
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void main(String[] args){
        int[] values={5,1,3,4,2,7};
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
       inorder(root);
       System.out.println();

    }
}
