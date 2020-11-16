package com.heraizen.cj.day1;

import java.util.Scanner;

public class reverse_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number:");
n=sc.nextInt();
System.out.print("Reverse of the entered number is ");
while(n!=0)
{
	System.out.print(n%10);
	n=n/10;
}
	}

}
