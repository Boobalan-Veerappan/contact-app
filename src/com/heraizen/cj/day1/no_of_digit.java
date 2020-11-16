package com.heraizen.cj.day1;

import java.util.Scanner;

public class no_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i=0;;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number:");
n = sc.nextInt();
while(n!=0)
{
	n=n/10;
	i++;
}
System.out.println("The number of digits in the entered number is "+i);
	}

}
