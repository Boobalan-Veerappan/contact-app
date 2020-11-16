package com.heraizen.cj.day1;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int n;
System.out.println("Enter the number of natural numbers to be generated:");
n = sc.nextInt();
System.out.println("The first "+n+" natural numbers in descending order are: ");
for(int i=n; i>=1;i--)
{
	System.out.print(i+" ");
}
	}

}
