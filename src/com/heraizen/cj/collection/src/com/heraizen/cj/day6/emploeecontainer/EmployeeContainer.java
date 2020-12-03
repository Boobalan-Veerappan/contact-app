package com.heraizen.cj.day6.emploeecontainer;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeContainer {
Set <Employee> EmployeeContainer = new HashSet<Employee>();
	void addEmployee(Employee emp) {
		EmployeeContainer.add(emp);
		
	}
	
	void deleteEmployee(int empno) {
		Set <Employee> delete =   EmployeeContainer.stream().filter(e->e.empno!=empno).collect(Collectors.toSet());
		if(delete.equals(EmployeeContainer))
		{
			System.out.println("Search Id Not Found");
		}
		else {
			System.out.println("Search Id Delete Successfully ");
		}
		
		EmployeeContainer = delete;
		viewEmployees();
	}
	void viewEmployee(int empno) {
		Set <Employee> view =   EmployeeContainer.stream().filter(e->e.empno==empno).collect(Collectors.toSet());
		
		if(view.isEmpty())
		{
			
			System.out.println("Search Not Found");
			
		}
		else {
		
		view.forEach(e->System.out.println("Employee Id : "+e.empno+" "+"Employee Name : "+e.ename+"job : "+e.job));
	}
	}
	void viewEmployees() {
		EmployeeContainer.forEach(e->System.out.println("Employee Id : "+e.empno+" "+"Employee Name : "+e.ename+"job : "+e.job));
	}
}
