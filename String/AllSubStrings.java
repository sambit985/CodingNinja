/*
For a given input string(str), write a function to print all the possible substrings.
Sample Input 1:
abc
Sample Output 1:
a 
ab 
abc 
b 
bc 
c 
*/

import java.util.Scanner;
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        for(int start=0; start<str.length();start++){
            for(int end=start;end<str.length();end++){
                System.out.println(str.substring(start,end+1)); // end+1 will not count
            }
        }
    } 
        public static void main(String[] args){
            Scanner Sc=new Scanner(System.in);
            String str=Sc.nextLine();
            printSubstrings(str);
        
	}

}
