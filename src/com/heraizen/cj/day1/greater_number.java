package com.heraizen.cj.day1;
import java.util.Scanner;

public class greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number num1:");
num1 = sc.nextInt();
System.out.println("Enter the second number num2:");
num2 = sc.nextInt();
if(num1>num2)
{
	System.out.printf("The bigger of the two numbers entered (%d and %d) is:%d",num1,num2,num1);
}
else
{
	
	System.out.printf("The bigger of the two numbers entered (%d and %d) is: %d",num1,num2,num2);
	
}
	}

}
