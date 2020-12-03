package com.heraizen.cj.day6.student;

import java.util.HashMap;
import java.util.Map;

public class StudentStorage {
	int k=0;
	static Map<Integer, Student> arrayMap = new HashMap<Integer, Student>();
	
	void add_student(Student s)
	{
		
		arrayMap.put(s.getId(), s);
		
	}
	void viewStudent()
	{
		arrayMap.forEach((i,s)->{
			System.out.println("Key : "+i+" Value : "+s.Name);
		});

	}
	void viewStudent(int i)
	{
		arrayMap.forEach((j,s)->{
			if(i==j)
			{
			k=1;
				System.out.println("The student is Name "+s.Name+" Courses "+s.Degree+" EMail "+s.email);
				
			}
		});
		if(k==0)
		{
			System.out.println("Student not found for this Key "+i);
		}
	}
	@Override
	public String toString() {
    
		return "[]" ;
        
    }
}
