/*
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
________________
Sample Input 2:
2
5
1 2 3 4 5 
3
10 20 30 
Sample Output 2:
15
60
*/

import java.util.Scanner;
public class Solution {
	
        public static int[] takeInput(){
         Scanner Sc=new Scanner(System.in);   
            int n=Sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
        
            arr[i]=Sc.nextInt();
            }      
            return arr;
        }
        
        public static int sum(int[] arr){
          int add=0;
            for(int i=0;i<arr.length;i++){
               add=add+arr[i]; 
            }
             return add;
        }
    public static void main(String[]args){
        
        int[] arr=takeInput();
        int AllSum=sum(arr);
        System.out.println(AllSum);
    }
	
}
