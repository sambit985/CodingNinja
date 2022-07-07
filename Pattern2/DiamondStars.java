/*
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
*/


import java.util.Scanner;
public class Solution {
    
	public static void main(String[]args) {
    Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int i=1;
        
        int n1=(n+1)/2;
        while(i<=n1) 
        {
            int space=1;
            while(space<=n1-i)
            {
                System.out.print(" ");
                space++;         
            }    
            int k=1; 
            while(k<=(2*i-1))
            {
                System.out.print("*");
                 k++;  
            }
            i++;
            System.out.println();
        
            }
          int n2=n/2; 
          i=n2;
          while(i<=n2 && i!=0)
          {
            int space=1;      
            while (space<=n2-i+1)
           {
             System.out.print(" ");
              space++;
           }
            int j=1;
            while(j<=(2*i-1)){
             System.out.print("*");
             j++;
           }
        
            System.out.println();
              i=i-1;
        }
    }
}
