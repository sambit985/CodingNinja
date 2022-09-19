/*
Given a generic tree, count and return the number of leaf nodes present in the given tree.

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
4
*/

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
     
        if(root==null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }
          int leaves=0;
        for(int i=0; i<root.children.size();i++){
            leaves=leaves+countLeafNodes(root.children.get(i));
        }
        return leaves;
	}
	
}
