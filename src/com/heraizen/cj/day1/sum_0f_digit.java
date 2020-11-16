package com.heraizen.cj.day1;

import java.util.Scanner;

public class sum_0f_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number:");
n = sc.nextInt();
while(n!=0)
{
	
int k= n%10;
sum = sum +k;
n=n/10;
	
}
System.out.println("The sum of digits of the entered number is "+sum);
	}

}
