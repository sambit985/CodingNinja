/*
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/


import java.util.Scanner;

class Solution {
    
    public static void main(String[] args) {
        
       Scanner S=new Scanner(System.in);
       int n=S.nextInt();
        int i,j;
        for(i=n;i>=1; i--){
            for(j=i;j<=n;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
