/*
Wap to print in following pattern:

Input:
4
Output:
A B C D
A B C D
A B C D
A B C D
*/

import java.util.Scanner;
public class Solution{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
               char jthChar=(char)('A'+j-1);
                System.out.print(jthChar);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
