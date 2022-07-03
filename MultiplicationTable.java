/* Write a program to print multiplication table of n
Input Format :
A single integer, n
Output Format :
First 10 multiples of n each printed in new line
Sample Input 1 :
2
Sample Output 1 :
2
4
6
8
10
12
14
16
18
20 */


import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		// Write your code here
   Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt(); // Take input from the user 
        
        for(int i=1; i<=10; i++){  // Continue from 1 to 10
            System.out.println(n*i);
        }
	}
}
