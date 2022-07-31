/*
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Sample Input :
4
9 8 10 8
8
Sample Output :
1
*/

import java.util.Scanner;
public class Solution {

	public static int firstIndex(int input[], int x) {
        
        for(int i=0;i<input.length;i++){
            if(input[i]==x){
                return i;
            }
        }
		return -1;
	}
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int[] input=new int[n];
        int x=Sc.nextInt();
        int result=firstIndex(input, x);
        System.out.println(result);
    }
	
}
