/*
You have been given a random integer array/list(ARR) of size N.
You are required to find and return the second largest element present in the array/list.
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
13
*/

public class Solution {  
    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        if(arr.length<2){
            return Integer.MIN_VALUE;
        }
        int temp;
      for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]<arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }           
          }
      }     
        return arr[1];
    }
 
    public static void main(String[] args){
        int[] arr={8,9,9,1,7,5,5,10,1,0,7};
        int result=secondLargestElement(arr);
        System.out.println(result);
    }
}
