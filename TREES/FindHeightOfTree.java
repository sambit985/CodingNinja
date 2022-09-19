/*
Given a generic tree, find and return the height of given tree

Sample Input 1:
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1:
3
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

	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        int temp=0;
        int height=0;
        if(root==null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }      
        for(int i=0; i<root.children.size(); i++){
            temp=getHeight(root.children.get(i));
            if(temp>height){
                height=temp;
            }
        }
        return height+1;
	}
}
