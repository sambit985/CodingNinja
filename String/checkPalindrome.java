/*
Wap in java to check whether given string is palindrome or not?
Input- "abba"
output-abba
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    String str = Sc.nextLine();
   String reverseStr = "";
    for (int i = str.length()-1; i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println( "Palindrome String");
    }
    else {
      System.out.println("not a Palindrome String");
    }
  }
}
