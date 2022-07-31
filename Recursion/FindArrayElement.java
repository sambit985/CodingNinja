/*
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
*/

import java.Arrays;
public class Solution{
public static boolean checkNumber(int[] input,int x){
  Arrays.sort(input);
  for(int i=0;i<input.length;i++){
     if(input[i]==x){
         return true;
       }
     }
     return false;
  }
  public static void main(String[] args){
   Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int[] input=new int[n];
    int x=Sc.nextInt();
    boolean result=checkNumber(input,x);
    System.out.println(result);
   }

}
