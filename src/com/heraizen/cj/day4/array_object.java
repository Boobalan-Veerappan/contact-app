package com.heraizen.cj.day4;
class details{
	int pid;
	String  pname;
	String  price;
	details(int pid,String pname,String price)
	{
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	void display()
	{
		System.out.println("pid = "+pid+" pname = "+pname+" price = "+price);
	}
}

public class array_object {

	public static void main(String[] args) {
	details d1 = new details(1001,"boobalan","200000");
	details d2 = new details(1003,"raghul","200000");
	details d3 = new details(1045,"guna","200400");
	details [] darr = {d1,d2,d3};
	
	for(details arr :darr)
		{
			arr.display();
		}
	}

}
