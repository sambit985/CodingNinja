/*
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
*/

import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int i = 1,j;
    
    while(i<=n){
        int odd = 2*i-1;
        j=n;
        while(j>=i){
            System.out.print(odd);
            odd = odd +2;
            j--;
        }
        j = 1;
        int  p =1;
        while(j<=i-1){       
            System.out.print(p);
            p= p+2;
            j++;
        }
        System.out.println();
        i++;
    }
 }
}
