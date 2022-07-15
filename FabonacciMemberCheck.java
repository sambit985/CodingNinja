/*
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/

import java.util.Scanner;
import java.util.Arrays;
public class Solution {
public static boolean checkMember(int n){
				
   int f1=0,f2=1;
   boolean isFib=false;
        if(n==f1||n==f2){
            isFib=true;
        }
        
        while(n>=f1){
         int nt=f1+f2;
            f1=f2;
            f2=nt;
            if(n==f1){
             isFib=true;
            }
        }
        
        return isFib;

    }	
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        boolean isFib=checkMember(n);
        System.out.println(isFib);
    }
}
