/*
Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Sample Input 1 :
8
Sample Output 1 :
2 4
*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);
        int number=Sc.nextInt();
    
        for(int i=2;i<=number/2;i++){
            if (number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
