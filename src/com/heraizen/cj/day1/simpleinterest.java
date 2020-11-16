package com.heraizen.cj.day1;
import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int amount,time;
float interest;
System.out.println("Enter the principal amount:");
amount = sc.nextInt();
System.out.println("Enter the rate of interest");
interest = sc.nextFloat();
System.out.println("Enter the time (years)");
time = sc.nextInt();
System.out.printf("Simple interest is %.0f",((amount*interest*time)/100));
	}

}
