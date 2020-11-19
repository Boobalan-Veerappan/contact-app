package com.heraizen.cj.day4;

class employee{
	String name="";
	String Id="";
	String salary = "";
	
	employee(String name,String id,String salary)
	{
		this.name = name;
		this.Id = id;
		this.salary = salary;
	}
	
	@Override
	 public String toString()
	 {
		System.out.println("Id = "+Id+" Name = "+name+" salary = "+salary);
		return "";
	 }
}

public class overrdingmethod {

	public static void main(String[] args) {
employee em = new employee("boobalan","1001","2000000");
          em.toString();
	}

}
