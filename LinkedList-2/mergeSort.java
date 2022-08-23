/*
 Given a singly linked list of integers, sort it using 'Merge Sort'.
*/

/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

    
  public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1==null){
             return head2;
        }
        if(head2==null){
               return head1;
        }
            
        LinkedListNode<Integer> t1=head1,t2=head2,tail=null,head=null;
        if(t1.data<=t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }
        else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null &&t2!=null){
            if(t1.data<=t2.data)
            {
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
            else
            {
                tail.next=t2;
                tail=tail.next;
                t2=t2.next;
            }
        }
        if(t1==null){
             tail.next=t2;
          }
        if(t2==null){
             tail.next=t1;
          }
        return head;
       }
    
    // Program for finding midpoint
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        LinkedListNode<Integer> fast=head, slow=head;
        if(head==null){
            return head;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    
    //Program for merge 2 divided sort list
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
       if(head==null){
         return head;
       }
        if(head.next==null){
            return head;
        }
        LinkedListNode<Integer> midNode=midPoint(head);
        LinkedListNode<Integer> part2Head=midNode.next;
        midNode.next=null;
        
        LinkedListNode<Integer> head1=mergeSort(head);
        LinkedListNode<Integer> head2=mergeSort(part2Head);
        LinkedListNode<Integer> mergedList=mergeTwoList(head1,head2);
        return mergedList;
	}

}
