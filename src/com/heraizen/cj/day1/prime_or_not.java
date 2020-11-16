package com.heraizen.cj.day1;

import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0,m=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number:");
n = sc.nextInt();
for(int i=2;i<n;i++)
{
	if(n%i == 0)
	{
		m =1;
		break;
	}
	else
	{
		m=0;
	}
}
if(m==1)
{
	System.out.println("The entered number "+n+" is not a prime number");
}
else
{
	System.out.println("The entered number "+n+" is a prime number");
}
	}
	
}
