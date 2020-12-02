package com.heraizen.cj.day6.experience;

public class Employee {
	private int empNumber;
	private String name;
	private float exp;

	Employee(int empNumber, String name, float exp) {
		this.empNumber = empNumber;
		this.name = name;
		this.exp = exp;
		try {
			if (exp > 2.5 && exp < 3.6) {
			} else {
				throw new IllegalArgumentException("Employee is not match with the expected experience");
			}
		} catch (IllegalArgumentException IA) {
			System.out.println(IA.getMessage());
		}
	}

}
