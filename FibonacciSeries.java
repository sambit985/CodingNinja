/*
Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
Sample Input 1:
6
Sample Output 1:
8
*/


import java.util.Scanner;
public class Solution{
    
static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
public static void main(String[]args){
Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    System.out.print(fib(n));
    }
}
