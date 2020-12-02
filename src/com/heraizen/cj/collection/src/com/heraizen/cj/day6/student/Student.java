package com.heraizen.cj.day6.student;

public class Student {
String Name;
String Degree;
 int getId;
String email;
	
	Student(String Name,String Degree,int getId,String email)
	{
		this.Name = Name;
		this.Degree = Degree;
		this.getId = getId;
		this.email = email;
		
	}
	
	public  int getId()
	{
		return getId;
	}
}
