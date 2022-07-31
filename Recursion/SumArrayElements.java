/*
Given an array of length N, you need to find and return the sum of all elements of the array.
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
*/


import java.util.Scanner;
public class Solution {

	public static int sum(int input[]) {
		int sum=0;
        for(int i=0;i<input.length;i++){
            sum+=input[i];
        }
        return sum;
	}
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int[] input=new int[n];
        int result=sum(input);
        System.out.println(result);
    }
}
