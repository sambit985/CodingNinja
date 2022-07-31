
public class Solution{
public static int sumn(int n){
 //base case
    if(n==0){
     return 0;
    }
    int smallOutput=sumn(n-1);
    int output=n+smallOutput;
    return output;
  }
  public static void main(String[] args){
  System.out.println(sumn(6));
  }
}
