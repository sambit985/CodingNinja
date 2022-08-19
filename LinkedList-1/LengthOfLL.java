/*
For a given singly linked list of integers, find and return its length. Do it using an iterative method.
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
Sample Output 1 :
7
Sample Input 2 :
2
10 76 39 -3 2 9 -23 9 -1
-1
Sample Output 2 :
8
0
*/

public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        int len=0;
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
	}
}
