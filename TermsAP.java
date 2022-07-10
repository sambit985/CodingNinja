/*
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
____________________________
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
*/
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
     Scanner Sc=new Scanner(System.in);
        int x=Sc.nextInt();
        int i=1,n=1;
        while(n<=x && n<=1000){
            int sum=(3*i)+2;
           if(sum%4 != 0){
               System.out.print(sum+" ");
               n=n+1;
           } 
            i=i+1;
        
        }
        
	}
}
