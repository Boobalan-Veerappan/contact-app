package com.heraizen.cj.day1;

import java.util.Scanner;

public class factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  n=0,m=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number:");
n = sc.nextInt();
for(int i=1;i<=n;i++)
{
	m=m*i;
}
System.out.println("The factorial of "+n+" is " +m);
	}

}
