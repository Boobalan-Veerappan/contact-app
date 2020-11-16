package com.heraizen.cj.day1;
import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int billingAmount;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the billing amount:");
billingAmount = sc.nextInt();
if(billingAmount > 6000)
{
	System.out.printf("Your net billing amount: %.0f",(billingAmount -(billingAmount*(0.1))));
}
else
{
	System.out.println("Your net billing amount: "+billingAmount);
}

	}

}
