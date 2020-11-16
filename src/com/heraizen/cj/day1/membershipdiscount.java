package com.heraizen.cj.day1;
import java.util.Scanner;

public class membershipdiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int amount ;
char member;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the bill amount:");
amount = sc.nextInt();
System.out.println("Enter the bill amount:");
member = sc.next().charAt(0);
if(member == 'Y') {
	System.out.printf("Thank you! Your total bill amount is Rs %d, discount is Rs %.0f and net amount payable is Rs %.0f.",amount,(amount*(0.1)),amount-(amount*(0.1)));
}
else
{
	System.out.printf("Thank you! Your total bill amount is Rs %d, discount is Rs %.0f and net amount payable is Rs %.0f.",amount,(amount*(0.03)),amount-(amount*(0.03)));
}
	}

}
