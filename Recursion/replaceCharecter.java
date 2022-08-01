/*
Wap to replace charecter'b' inplace of 'a' in a string.
Input:-"abscdvfgbbaca"
output:-bbscdvfgbbbcb"
*/

public class HelloWorld{
   public static String replacechar(String str,char a, char b){
       if(str.length()==0){
           return str;
       }
       String smallOutput=replacechar(str.substring(1),a,b);
       if(str.charAt(0)==a){
           return b+smallOutput;
       }else{
           return str.charAt(0)+smallOutput;
       }
   }
     public static void main(String []args){
        System.out.print(replacechar("acvsbac",'a','b'));
     }
}
