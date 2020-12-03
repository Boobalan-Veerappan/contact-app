package com.heraizen.cj.day6.emploeecontainer;

import java.util.Scanner;

import com.heraizen.cj.day6.commonexception.CommonExecption;

public class EmployeeRegistration {

	public static void main(String[] args) {
		
		EmployeeContainer empcon = new EmployeeContainer();
		Scanner sc = new Scanner(System.in);
		int m = 1;
		int n=0;
		while (m == 1) {
			System.out.println(
					"1-Enter for Add Employee 2-Delete Employee 3-View Employee Enter Employee  4-view Employee  5-Exit");
			 n = getNumber();
			switch (n) {
			case 1: {
				Employee emp = new Employee();
				
				emp.empno = checkId();
				
				System.out.println("Enter Name");
				emp.ename = sc.next();
				System.out.println("Enter job roles");

				
				emp.job = sc.next();

				empcon.addEmployee(emp);
				break;
			}
			case 2: {

				int num = checkdelete();
				empcon.deleteEmployee(num);
				break;
			}
			case 3: {

				int num = checkview();
				empcon.viewEmployee(num);
				break;
			}
			case 4: {
				System.out.println("View Everything");
				
				empcon.viewEmployees();
				break;
			}
			case 5: {
				System.out.println("The Program has existing ");
				m = 0;
				break;
			}
			
			}
		}
	}

	public static int getNumber()
	{
		int n=0;
		Scanner sc = new Scanner(System.in);
		try {
		 n = sc.nextInt();
		if(n>5 || n<0)
		{
			n=0;
			throw new CommonExecption("Please enter valid Number should be less than 5.");
		}
		}
		catch(CommonExecption ce)
		{
			
		}
		catch(Exception e){
			System.out.println("Please enter valid Number.");
		n=0;	
		}
		return n;
	}
	public static int checkId()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter Employee Id");
		
		try {
		 n = sc.nextInt();

		 return n;
		}
		catch(Exception e)
		{
			System.out.println("Please Enter the validate Id");
			n=checkId();
		}

		return n;
	}
	
	public static int checkdelete()
	{
		Scanner sc = new Scanner(System.in);
	int n = 0;
	System.out.println("Which one you want to Delete please Enter the Employee Id");
	
	try {
	 n = sc.nextInt();

	 return n;
	}
	catch(Exception e)
	{
		System.out.println("Please Enter the validate Id");
		n=checkdelete();
	}
		
		return n;
	}
	
	public static int checkview()
	{
		
		Scanner sc = new Scanner(System.in);
	int n = 0;
	System.out.println("Which one you want to see please Enter the Employee Id");
	
	try {
	 n = sc.nextInt();

	 return n;
	}
	catch(Exception e)
	{
		System.out.println("Please Enter the validate Id");
		n=checkview();
	}
		
		return n;
	}
	
	
}
