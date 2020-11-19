package com.heraizen.cj.day4;


class Employee{
	float salary = 2000000;
	int id;
	String name; 
	Employee(int id,String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("Id : "+id+" name : "+name+" salary : "+salary);
	}
	Employee(int id,String name,float sal)
	{
		this.id = id;
		this.name = name;
		this.salary = sal;
		System.out.println("Id : "+id+" name : "+name+" salary : "+salary);
	}
}

public class employee_det {

	public static void main(String[] args) {
		Employee e1 = new Employee(10001,"boobalan");
        Employee e2 = new Employee(10002,"RAGHUL",1000000);
	}

}
