/*
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)

Sample Input 1 :
1100
Sample Output 1 :
12

Sample Input 2 :
111
Sample Output 2 :
7
*/

import java.util.Scanner;
public class Main {
	
 public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      System.out.println(BinaryToDecimal(n));
	}

// create a method which is sharable so that'swhy use static keyword 
 static int BinaryToDecimal(int n){
    
   // int num=n;
    int dec_Value=0;
    int base=1;
    
    while(n>0){     // if n is greater than 0 then only loop will execute
        int lastDigit=n%10;
        n/= 10;
        dec_Value=dec_Value+lastDigit*base;
        base=base*2;
    }
    return dec_Value;
    
 }
}
