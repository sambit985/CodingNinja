/*
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.

Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
*/


public class Solution {  

    public static void insertionSort(int[] arr) {
    	//Your code goes here
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
  
           // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");  
    }
    public static void main(String[] args){
        int[] arr={1,7,14,0,9,4,18,2,4,5};
        insertionSort(arr);
        printArray(arr);
    }

}
