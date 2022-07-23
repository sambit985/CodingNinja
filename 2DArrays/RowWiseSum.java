/*
For a given two-dimensional integer array/list of size (N x M),find and print the sum of each of the
row elements in a single line, separated by a single space.
Sample Input 1:
1
4 2 
1 2 
3 4 
5 6 
7 8
Sample Output 1:
3 7 11 15 
*/

import java.util.Scanner;
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        for(int i=0;i<mat.length;i++){
            int rSum=0;
            for(int j=0;j<mat[i].length;j++){
                rSum=rSum+mat[i][j];
            }
            System.out.print(rSum+" ");
        }
        
	}
    public static void main(String[] args){
        int[][] mat={{6,9,8,5},{9,2,4,1}};
       rowWiseSum(mat);
    }

}
