/*
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4
****
.****
..****
...****
The dots represent spaces.
*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            int star=1;
            while(star<=n){
               System.out.print('*');
                star++;
            }
            System.out.println();
            i=i+1;
            
        }
        
	}
}
