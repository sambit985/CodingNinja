/*
You have been given a random integer array/list(ARR) of size N.
You have been required to push all the zeros that are present in the array/list to the end of it. 
Also, make sure to maintain the relative order of the non-zero elements.
Sample Input 1:
1
7
2 0 0 1 3 0 0
Sample Output 1:
2 1 3 0 0 0 0
*/

public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
      
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               arr[count++]=arr[i];   // Here Count increment
         }
       }
      // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while(count<arr.length){
            arr[count++]=0;
        }
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr=new int[]{5,0,7,4,8,1,3,0,7,2,0};
        pushZerosAtEnd(arr);
        printArr(arr);
    }

}
