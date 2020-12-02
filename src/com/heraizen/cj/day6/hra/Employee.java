package com.heraizen.cj.day6.hra;

public class Employee {
int empId;
String designation ;
double basic;
double  hra;
String Name;
void PrintDetails()
{
	System.out.println("\n Employee Name : "+Name+" \n Designation : "+designation+"\n EmpId : "+empId+"\n Basic : "+basic);
}
void  CalculationHra()
{
	if(basic>500)
	{
	if(designation.equalsIgnoreCase("Manager"))
	{
		System.out.println("your HRA is "+basic*(0.1));
	}
	else if(designation.equalsIgnoreCase("officer"))
	{
		System.out.println("your HRA is "+basic*(0.12));
	}
	else if(designation.equalsIgnoreCase("clerk"))
	{
		System.out.println("your HRA is "+basic*(0.05));
	}
	}
	else
	{
		try
		{
		throw new LowsalException("you salary is very low");
	}
		catch(LowsalException lse)
		{
			System.out.println(lse.getMessage());
		}
		
	}
	
}
Employee(int empId ,String designation,double basic,String Name)
{
	this.empId = empId;
	this.designation = designation;
	this.basic = basic;
this.Name = Name;
}
}
