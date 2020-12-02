package com.heraizen.cj.day6.student;

import java.util.HashMap;
import java.util.Map;

public class StudentStorage {
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
				System.out.println("The student is "+s.Name+" "+s.Degree+s.email);
				
			}
		});
	}
	@Override
	public String toString() {
    
		return "[]" ;
        
    }
}
