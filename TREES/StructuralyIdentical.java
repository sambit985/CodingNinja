/*
Given two Generic trees, return true if they are structurally identical i.e. they are made of nodes with the same values arranged in the same way.

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
true
Sample Input 2 :
10 3 20 30 40 2 40 50 0 0 0 0 
10 3 2 30 40 2 40 50 0 0 0 0
Sample Output 2:
false

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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
        if(root1.data != root2.data){
            return false;
        }
        
        boolean ans=true;
        
        for(int i=0;i<root1.children.size();i++){
            boolean smallAns=checkIdentical(root1.children.get(i), root2.children.get(i));
            if(smallAns==false){
                ans=smallAns;
                return ans;
            }
        }
        return ans;
	}
}
