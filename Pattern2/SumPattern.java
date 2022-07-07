/*
Write a program to print triangle of user defined integers sum.
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6

Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/


import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        
        int i=1;
        while(i<=n){
            int temp=2;
            int j=1;
            System.out.print(1);
            while(j<i){
                System.out.print("+"+temp);
                temp++;
                j++;
            }
            int sum=(i*i+i)/2;
            System.out.println("="+sum);
            i=i+1;
        }
    }
}
