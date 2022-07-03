/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1

Sample Input 1 :
 3 4
Sample Output 1 :
81

*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int x = Sc.nextInt();  // x=2
        int n = Sc.nextInt(); // n is a power of x. For example n=5
        int power = 1;
        
            for(int i = 1; i<=n; i++){
                power = power*x;
            }
            System.out.println(power);
    }
}
