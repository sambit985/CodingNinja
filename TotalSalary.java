/* Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
    where :
    hra   = 20% of basic
    da    = 50% of basic
    allow = 1700 if grade = ‘A’
    allow = 1500 if grade = ‘B’
    allow = 1300 if grade = ‘C' or any other character
    pf    = 11% of basic. */






import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {
	
	public static void main(String[] args) {
		// Write your code here
     Scanner Sc = new Scanner(System.in);
        int basic = Sc.nextInt();
        String str = Sc.next();
        char ch = str.charAt(0);
        int allow;
        if(ch=='A'){
            allow = 1700;
        }else if(ch=='B'){
            allow = 1500;
        }else{
            allow = 1300;
        }
        double totalSalary=((basic+(0.20*basic)+(0.50*basic)+allow)-(0.11*basic));
        double r=Math.round(totalSalary);
	    	int result=(int)(r);
	    	System.out.println(result);
        
	}
}
