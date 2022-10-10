
class Node{
    int data;
    Node left, right;

    public Node(int item){
        data=item;
        left=null;
        right=null;
    }
}


public class BinaryTreeInsert {
    Node root;
    public void insert(Node node,int data){
        if(data<node.data){
            if(node.left!=null){
                insert(node.left,data);
            }else{
                System.out.println("  Inserted " + data + " to left of "+ node.data);
                node.left=new Node(data);
            }
        }
        if(data>node.data){
            if(node.right!=null){
                insert(node.right,data);
            }else{
                System.out.println("  Inserted " + data + " to right of "+ node.data);
                node.right=new Node(data);
            }
        }
    }
        //traverse
        public void traverseInOrder(Node node){
            if(node!=null){
            traverseInOrder(node.left);
            System.out.print(node.data);
            traverseInOrder(node.right);
          }
        }

    public static void main(String[] args){
        BinaryTreeInsert ob2=new BinaryTreeInsert();
        Node root=new Node(1);
        ob2.insert(root,2);
        ob2.insert(root, 4);
        ob2.insert(root, 8);
        ob2.insert(root, 6);
        ob2.insert(root, 7);
        ob2.insert(root, 3);
        ob2.insert(root, 9);
        System.out.println("Binary tree Insert:");
        ob2.traverseInOrder(root);
    }
}
