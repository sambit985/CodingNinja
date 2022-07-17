/*
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.

Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
*/

public class Solution{	
  public static int findUnique(int[] arr){
   for(int i=0;i<arr.length;i++){ 
       int j;
       for(j=0;j<arr.length;j++){
           if(i!=j){
                if(arr[i]==arr[j]){
                    break;
                }
           }
       }
       if(j==arr.length){
           return arr[i];
       }
   }
      return Integer.MAX_VALUE;
  }
}
