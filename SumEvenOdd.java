/* 
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
 Integer N
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)
*/

import java.util.Scanner;
public class SumEvenOdd {
	
	public static void main(String[] args) {
		// Write your code here
    	Scanner Sc=new Scanner(System.in);
		int number=Sc.nextInt();
        int Sum_Of_Even=0,Sum_Of_Odd=0;
        while(number!=0)
        {
            int temp=number%10;
            if(temp%2==0){
                Sum_Of_Even+=temp;
            }
            if(temp%2!=0){
                Sum_Of_Odd+=temp;
            }
            number=(int)(number/10);
        }
	    System.out.println(Sum_Of_Even+"   "+Sum_Of_Odd);
    }
}
