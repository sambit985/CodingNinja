/*
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
_____________________
Sample Input 2:
2
5
9 3 6 2 0
4
4 3 2 1
Sample Output 2:
0 2 3 6 9
1 2 3 4
*/


public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }              
            }      
        }
    }   
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){    
            System.out.print(arr[i]);
        }      
    }
    public static void main(String[]args){
        int[] arr={1,3,6,2,8,4};
        selectionSort(arr);
        printArr(arr);
        
    }

}
