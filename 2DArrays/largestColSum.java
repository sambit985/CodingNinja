/*
Wap in java to Sum all the columns of 2d array separately and find out which column sum is largest
Input- 1 2 3
       4 5 6
       7 8 9
Output- 18
*/

import java.util.Scanner;
public class Solution{
    public static int largestColSum(int[][] arr2d){
        int row=arr2d.length;
        int col=arr2d[0].length;
        int largest=Integer.MIN_VALUE;
        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
             sum=sum+arr2d[i][j];
            }
            if(largest<sum){
            largest=sum;
          }
        }
        
        return largest;
    }
    public static void main(String[] args){
        int[][] arr2d={{1,2,3},{4,5,6},{7,8,9}};
        int result=largestColSum(arr2d);
        System.out.println(result);
    }
}
