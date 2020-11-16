package com.heraizen.cj.day1;
import java.util.Scanner;

public class odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
num = sc.nextInt();
if(num%2 ==0)
{
	System.out.println("The entered number "+num+" is even");
}
else
{
	System.out.println("The entered number "+num+" is odd");
}
	}

}
