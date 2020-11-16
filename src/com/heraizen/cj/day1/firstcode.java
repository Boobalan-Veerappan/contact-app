package com.heraizen.cj.day1;
import java.util.Scanner;

public class firstcode {

	public static void main(String args[]) {
		
		int num1=0 ,num2=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 value: " );
		num1 = sc.nextInt();
		System.out.print("Enter the num1 value: " );
		num2 = sc.nextInt();
		System.out.print("Sum of "+num1+ " and "+num2+ " is " +(num1+num2));
	}
	
}
