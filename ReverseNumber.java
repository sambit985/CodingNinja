/*
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
*/

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        int reverse=0,lastDigit=0;
        for(;num!=0; num=num/10){
            // get last digit from num
             lastDigit=num%10;
             reverse=reverse*10+lastDigit;              
        }
         System.out.print(reverse);
    }
}
