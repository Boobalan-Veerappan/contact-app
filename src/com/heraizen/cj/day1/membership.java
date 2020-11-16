package com.heraizen.cj.day1;
import java.util.Scanner;

public class membership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name,mobilenumber;
int age;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name:");
name = sc.nextLine();
System.out.println("Enter the mobile number:");
mobilenumber = sc.nextLine();
System.out.println("Enter the age:");
age = sc.nextInt();
if(age>=18)
{
	System.out.println("\"Congratulations "+name+" for your successful registration.\"");
}
else
{
	System.out.println("\"Sorry! You need to be at least 18 years old to get membership.\"");
}
	}

}
