
/*
Wap in java to replace 3.14 in place of pi.
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
