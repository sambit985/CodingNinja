/*
Write a program to print entire string in a reversed order
Input- a b c d e
Output- e d c b a
*/

import java.util.Scanner;
public class Solution{
  public static String reverse(String str){
    String reversedString=" ";
  for(int i=str.length()-1;i>=0;i--){
     reversedString+=str.charAt(i);
    }
    return reversedString;
  }
  public static void main(String[] args){
   Scanner Sc=new Scanner(System.in);
    String reversedString=reverse(str);
    System.out.println(reversedString);
  }
}
