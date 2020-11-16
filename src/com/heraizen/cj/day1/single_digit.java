package com.heraizen.cj.day1;

import java.util.Scanner;

public class single_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter any number:");
int n =sc.nextInt();
int sum=0;
while(n>10)
{
	sum=0;
	while(n!=0)
	{
		sum=sum+(n%10);
		n=n/10;
	}
	n=sum;
	
}
System.out.println("Single digit sum is: "+n);
	}

}
