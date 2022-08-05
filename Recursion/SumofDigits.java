/*
Write a recursive function that returns the sum of the digits of a given integer.
Sample Input 1 :
12345
Sample Output 1 :
15
Sample Input 2 :
92
Sample Output 2 :
11
*/

public class solution {
	public static int sumOfDigits(int input){
         if(input == 0) {
             return 0;
         }
         //recursive call
         return input % 10 + sumOfDigits(input/10);
	}
}
