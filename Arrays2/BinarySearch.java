/*
You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'.
Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.

Sample Input 1:
7
1 3 7 9 11 12 45
1
3
Sample Output 1:
1
_________________
Sample Input 2:
7
1 2 3 4 5 6 7
2
9
7
Sample Output 2:
-1
6
*/

public class Solution { 

    public static int binarySearch(int[] arr, int x){
    	//Your code goes here
        int left=0, right=arr.length-1; //Start from 0 index and end with n index
      
          while(left<=right){  // binary search only exist if left value less than right value in array 
            int mid=(left+right)/2;  // Check what is the middle value of array
            if(arr[mid]==x){   // If middle value of array is equal with search key
                return mid;    // mid value return
            }
            if(arr[mid]<x){   // if mid value less than search key
                left=mid+1;    // then ignore left half of array
            }
            else{
                right=mid-1; // if midd value greater than search key then right half ignore
            }
        }
        return -1;   // If loop will end but search key not found in an array then return -1
    } 
}
