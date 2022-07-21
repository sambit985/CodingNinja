/*
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
merge them into a third array/list such that the third array is also sorted.
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13 
*/

import java.util.*;
public class Solution{
  
  public static int[] merge(int[] arr1, int[] arr2){
     int i=0,j=0,k=0;
    int m=arr1.length;
     int n=arr2.length;
    int[] arr3=new int[m+n];
     while(i<m && j<n){
        if(arr1[i]<arr2[j]){
          arr3[k]=arr1[i];
          i++;
          k++;
        }else{
          arr3[k]=arr2[j];
          j++;
          k++;
        }
     }
    while(i<m){
      arr3[k]=arr[i];
      i++;
      k++;
    }
    while(j<n){
    arr3[k]=arr2[j];
      j++;
      k++;
    }
    return arr3;
  }
  public static void printArr(int[] arr3){
  for(int i=0;i<arr3.length;i++){
    System.out.print(arr3[i]);
    }
  }
 public static void main(String[] args){
   int[] arr1={1,4,8,10,13,17};
   int[] arr2={12,11,2,3,5,7,9};
   int[] arr3=merge(arr1,arr2);
   printArr(arr3);
 } 
}
