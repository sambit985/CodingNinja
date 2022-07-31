/*
Given the number 'n', find out and return the number of digits present in a number recursively.
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
*/

import java.util.Scanner;
public class Solution {
	public static int count(int n){
		//Write your code here
        int c=0;
        while(n>0){
          n=n/10; // reverse number
          c++;
       }
        return c;
    }
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        System.out.println(count(n));
    }
}
