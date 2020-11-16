package com.heraizen.cj.day1;
import java.util.Scanner;

public class greater_no_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the 1st number num1:");
num1 =sc.nextInt();
System.out.println("Enter the 2nd number num1:");
num2 =sc.nextInt();
System.out.println("Enter the 3rd number num1:");
num3 =sc.nextInt();
if(num1>num2 && num1>num3)
{
	System.out.println("The biggest of the 3 numbers entered is: "+num1);
}
else if(num2>num1 && num2>num3)
{
	System.out.println("The biggest of the 3 numbers entered is: "+num2);
}
else {
	
	System.out.println("The biggest of the 3 numbers entered is: "+num3);
	
}
	}

}
