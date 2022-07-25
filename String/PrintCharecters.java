// Write a program in java to print all the charecters of String

import java.util.Scanner;
public class Silution{
  public static void printChars(String str){
  for(int i=0;i<str.length();i++){
    System.out.println(str.charAt(i));
   }
  }
  public static void main(String[] args){
  Scanner Sc=new Scanner(System.in);
    String str=Sc.nextLine();
    printChars(str);
  }
}
