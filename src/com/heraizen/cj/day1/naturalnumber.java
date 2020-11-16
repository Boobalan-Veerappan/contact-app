package com.heraizen.cj.day1;

import java.util.Scanner;

public class naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0 ,n=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of natural numbers to be generated:");
n= sc.nextInt();
for(i=1;i<=n;i++)
{
	System.out.print(i+" ");
}
	}

}
