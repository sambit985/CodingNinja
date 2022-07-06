/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
    1
   12
  123
 1234 

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
            System.out.print(j);
            j+=1;
        }
        System.out.println();
        i+=1;
    }
    }
}
