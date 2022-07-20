/*
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
*/


public class Solution {  

    public static void bubbleSort(int[] arr){
    	//Your code goes here
        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }  

}
