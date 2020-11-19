package com.heraizen.cj.day4;

public class set_value {
	private int id;
	private String name;
	private float sal;

	public set_value(int id, String name) {
		this(id, name, 20000);
	}

	public set_value(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void setValues(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + sal);
		System.out.println("-------------------------------");
	}
	public static void main(String[] args) {
		set_value emp = new set_value(101, "boobalan", 23000);
		emp.display();
		set_value emp2 = new set_value(104, "raghul");
		emp2.display();

	}

}
