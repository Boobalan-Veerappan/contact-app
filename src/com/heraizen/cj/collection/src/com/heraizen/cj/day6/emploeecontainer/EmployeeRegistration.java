package com.heraizen.cj.day6.emploeecontainer;

import java.util.Scanner;

public class EmployeeRegistration {

	public static void main(String[] args) {
		
		EmployeeContainer empcon = new EmployeeContainer();
		Scanner sc = new Scanner(System.in);
		int m = 1;
		int n=0;
		while (m == 1) {
			System.out.println(
					"1-Enter for Add Employee 2-Delete Employee 3-View Employee Enter Employee  4-view Employee  5-Exit");
			 n = sc.nextInt();
			switch (n) {
			case 1: {
				Employee emp = new Employee();
				System.out.println("Enter Employee Id");
				emp.empno = sc.nextInt();
				System.out.println("Enter Name");
				emp.ename = sc.next();
				System.out.println("Enter job roles");
				String s = sc.next();
				System.out.println(s);
				//emp.job = sc.next();
				sc.nextLine();
				empcon.addEmployee(emp);
				break;
			}
			case 2: {
				System.out.println("Which one you want to Delete please Enter the Employee Id");
				int num = sc.nextInt();
				empcon.deleteEmployee(num);
				break;
			}
			case 3: {
				System.out.println("Which one you want to see please Enter the Employee Id");
				int num = sc.nextInt();
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
			default :{
				System.out.println("please");
			}
			}
		}
	}

}
