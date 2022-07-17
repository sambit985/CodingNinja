/*
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself.
Sample Input 1:
1
6
9 3 6 12 4 32
Sample Output 1 :
3 9 12 6 32 4

*/


import java.util.Scanner;
Public class Solution{
public static void swapAlternate(int[] arr){
  int temp=0;
  for(int i=0;i<arr.length-1;i=i+2){
      temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
   }
  }
public static int[] take input(){
    Scanner Sc=new Scanner(System.in);
     int n=Sc.nextInt();
     int[] arr=new int[n];
       for(int i=0;i<n;i++){
          arr[i]=Sc.nextInt();
        }
         return arr;
     }
  public static void main(String[] args){
   int[] arr=takeInput();
   swapAlternate(arr);
  }
}
