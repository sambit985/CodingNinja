/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
*/



import java.util.Scanner;

class Solution {
    
    public static void main(String[] args) {
        
       Scanner S=new Scanner(System.in);
       int n=S.nextInt();
       
       int i=1;
       while(i<=n){
           int j=1;
           
          int jth=('A'+i-1);
           
           while(j<=i){
               
               System.out.print((char)(jth));
               j=j+1;
               jth=jth+1;
           }
           System.out.println();
           i += 1;
       }
    }
}
