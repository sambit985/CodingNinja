/*
Print in the following pattern
Input:3
Output:
   *
  **
 *** 
*/



import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    
    int i=1;
    while(i<=n){
        int spaces=1;
        while(spaces<=n-i){
            System.out.print(' ');
            spaces += 1;
        }
        int j=1;
        while(j<=i){
            System.out.print('*');
            j+=1;
        }
        System.out.println();
        i+=1;
    }
    }
