/*
For a given a string(str), find and return the highest occurring character.
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
*/

import java.util.Scanner;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        int[] count=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        int max=Integer.MIN_VALUE;
        char result=' ';
        for(int i=0;i<str.length();i++){
            if(max<count[str.charAt(i)]){
                max=count[str.charAt(i)];
               result=str.charAt(i);   
            }
        }
        return result;
	}
    public static void main(String[] args){
       Scanner Sc=new Scanner(System.in);
        String str=Sc.nextLine();
        char highOccur=highestOccuringChar(str);
        System.out.println(highOccur);
    }

}
