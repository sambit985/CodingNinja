/*
For a given input string(str), find and return the total number of words present in it.
It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and
trailing spaces in the given input string.
Sample Input 1:
Coding Ninjas!
Sample Output 1:
2
________________
Sample Input 2:
this is a sample string
Sample Output 2:
5
*/
import java.util.Scanner;
public class Solution {

	public static int countWords(String str) {	       
        if(str.length()==0){ //If length of the given string is 0 then this block will execute and return 0
            return 0;
        }
         int count=0; //Initialize count
         for(int i=0;i<str.length()-1;i++){ // loop will run from index 0 to n-1 index
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){  //Current character is space and next character is not a space
                count++;
            }
        }
        return count+1; //since last word does not contain and character after that
	}
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        String str=Sc.nextLine();
        int result=countWords(str);
        System.out.println(result);
    }
   

}
