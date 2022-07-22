/*
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. 
Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2 
_________________
Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2 
0 0 0 1 1 2 2

*/


public class Solution {

    public static int[] sort012(int[] arr){
    	//Your code goes here
        int zerosCount=0;
        int onesCount=0;
        int twosCount=0;
        
        for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               zerosCount++;    
           }
            if(arr[i]==1){
                onesCount++;
            }
            if(arr[i]==2){
              twosCount++;
            }
        } 
        int temp=0;
        for(int i=0;i<zerosCount;i++){
            arr[i]=0;
        }
        for(int i=zerosCount;i<(zerosCount+onesCount);i++){
            arr[i]=1;
        }
        for(int i=(zerosCount+onesCount);i<arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }
    
    public static void main(String[] args){
        int[] arr={1,0,2,2,1,2,1,1,2,0};
       int[] result= sort012(arr);
        System.out.print(result);
    }

}
