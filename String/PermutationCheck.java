/*
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Sample Input 1:
abcde
baedc
Sample Output 1:
true
_______________
Sample Input 2:
abc
cbd
Sample Output 2:
false
*/

import java.util.Arrays;
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        if(str1.length()!=str2.length()){  // Compare length of both the string
            return false;
        }
        
        char ch1[]=str1.toCharArray(); // convert string1 to charecter array
        char ch2[]=str2.toCharArray();  // Convert strin2 to charecter aray
        
        Arrays.sort(ch1);   // sort charectyer array using sort method
        Arrays.sort(ch2);   // sort charecter array using sort method
        
        for(int i=0;i<str1.length();i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
	}
   public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        String str1=Sc.nextLine();
        String str2=Sc.nextLine();
        boolean result=isPermutation(str1,str2);
        System.out.println(result);
    }

}
