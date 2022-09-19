/*
Given a tree and an integer x, find and return number of Nodes which are greater than x.

Sample Input 1 :
35 10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
3
Sample Input 2 :
10 10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
5
*/

public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here		
        int sum=0;
        if(root.data > x){
            sum++;
        }
        
        for(int i=0; i<root.children.size(); i++){
            int smallOutput=numNodeGreater(root.children.get(i), x);
            sum=sum+smallOutput;
        }
        return sum;
	}
	
}
