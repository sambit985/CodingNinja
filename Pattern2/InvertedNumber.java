/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1

*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        
        int i=1;
        while(i <= n){
           int j=n-i+1;
           int temp= j;
           while(j >0 ){
               System.out.print(temp);
               j--;
           }
           System.out.println();
           i++;
        }
	}

}
