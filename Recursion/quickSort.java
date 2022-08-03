/*
Wap to sort an array using quick sort.
*/

import java.util.*;
import java.util.Scanner;
import java.util.Scanner;
public class Solution {
    public static int partition(int[] arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];
        
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
        
    }
	public static void sort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            sort(arr,low,pivotIndex-1);
            sort(arr,pivotIndex+1,high);
        }
        
    }
	public static void quickSort(int[] input){
		    int start = 0;
	        int end = input.length-1;
	        sort(input, start, end);
		
	}
    public static void main(String[] args){
        int[] arr={2,3,4,7,5,9,1};
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	
}
