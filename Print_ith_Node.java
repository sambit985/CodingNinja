/*
For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.
*/

public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
          int j = 0;
        LinkedListNode<Integer> temp= head;
       while (head != null){
        if (j == i){
            System.out.println(head.data);
            break;
        }
        head=head.next;
        j++;
     }
	}
}
