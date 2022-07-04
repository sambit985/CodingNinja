/*
Print the following pattern for the given N number of rows.

Pattern for N = 4
1
21
321
4321

*/



import java.util.Scanner;
public class ReverseTriangleNumber {
	public static void main(String[] args) {
		
	Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
     int i=1;
        while(i<=n){
            int j=i;
            while(j>=1){
                System.out.print(j);
                j=j-1;
            }
            System.out.println();
            i=i+1;
        }
	}
}
