package com.heraizen.cj.day1;
import java.util.Scanner;

public class swaptwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number num1:");
first = sc.nextInt();
System.out.println("Enter the second number num2:");
second = sc.nextInt();
System.out.println("Before swap, the values of num1="+first+" and num2="+second);
temp = first;
first=second;
second = temp;
System.out.println("After swap, the values of num1="+first+" and num2="+second);
	}

}
