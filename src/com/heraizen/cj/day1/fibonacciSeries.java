	package com.heraizen.cj.day1;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,a=0,b=1,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
		n= sc.nextInt();
		System.out.print("Fibonacci series up to the entered number is: "+a+" "+b+" ");
for(int i=0;c!=n;i++)
{
	c= a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
	
}
	}

}
