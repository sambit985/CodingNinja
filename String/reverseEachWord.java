/*
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
________________________
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/


public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        StringBuffer s = new StringBuffer(str);
      str = s.reverse().toString();
      String [] rev = str.split(" ");
      StringBuffer reverse = new StringBuffer();
      for(int i = rev.length - 1; i >= 0; i--) {
          reverse.append(rev[i]).append(" ");
      }
      return reverse.toString();
	}

}
