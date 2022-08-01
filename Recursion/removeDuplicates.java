/*
Given a string S, remove consecutive duplicates from it recursively.
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
________________
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/

public class Solution{
    public static String replacepi(String str){
        if(str.length()<=1){
            return str;
        }
      if(str.charAt(0)=='p'&& str.charAt(1)=='i'){
          String smallOutput=replacepi(str.substring(2));
          return 3.14+smallOutput;
      }else{
          String smallOutput=replacepi(str.substring(1));
          return str.charAt(0)+smallOutput;
      }
    }
    public static void main(String[] args){
        System.out.print(replacepi("apipivcipi"));
    }
}
