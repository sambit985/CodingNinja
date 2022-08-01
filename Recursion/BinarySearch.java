/*
Write a program to find out an element present in which index of array using Binary search.
Input:- 1,2,3,4,5,6
        3
Output:-2
*/
public class BinarySearch{
    public static int binary(int[] arr,int si, int li, int x){
        // Base case
        if(si>li){
            return -1;
        }
        int midIndex=(si+li)/2;
        if(arr[midIndex]==x){
            return midIndex;
        }else if(arr[midIndex]<x){
            return binary(arr,midIndex+1,li,x);
        }else{
            return binary(arr,si,midIndex-1,x);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int result=binary(arr,0,arr.length-1,7);
        System.out.println(result);
    }
}
