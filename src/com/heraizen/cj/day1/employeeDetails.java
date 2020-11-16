package com.heraizen.cj.day1;

import java.util.Scanner;
public class employeeDetails {

	public static void main(String[] args) {
		String employeeId ;
		String employeeName;
		int employeeSalary;
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the empno:");
employeeId = sc.nextLine();
System.out.println("Enter the employee name:");
employeeName = sc.nextLine();
System.out.println("Enter the monthly salary:");
employeeSalary = sc.nextInt();
System.out.println("Hi "+employeeName+" Your employee id is "+employeeId+", monthly salary is Rs "+employeeSalary+" and yearly salary is Rs "+(employeeSalary*12));
	}

}
