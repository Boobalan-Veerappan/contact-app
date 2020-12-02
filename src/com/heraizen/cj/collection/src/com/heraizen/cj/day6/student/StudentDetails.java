package com.heraizen.cj.day6.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		StudentStorage ss = new StudentStorage();
		int k=2;
		int i=0;
		
		 Scanner sc = new Scanner(System.in);
		while(i!=k)
		{
			System.out.println("Enter the Name");
			String Name = sc.nextLine();
			System.out.println("ENter the Email address");
			String email = sc.nextLine();
			System.out.println("Enter the Course");
			String course = sc.nextLine();
			Student s = new Student(Name,course,i+1,email);
			ss.add_student(s);
			i++;
		} 
		ss.viewStudent();
System.out.println("ENter String for find");
int  find = sc.nextInt();
ss.viewStudent(find);
	}

	

	
}
