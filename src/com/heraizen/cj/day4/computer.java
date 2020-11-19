package com.heraizen.cj.day4;

class product1{
	int id ;
	String Name ="";
	String amount;
	product1(int id,String name,String sala)
	{
		this.id = id;
		this.Name = name;
		this.amount = sala;
	}
	void view()
	{
		System.out.println("id = "+id+" Name = "+Name+" amount = "+amount);
	}
}

public class computer {
//static int a=100;
	public static void main(String[] args) {
		product1 desk = new product1(1001,"sony","35000");
		
		product1 lap = new product1(1002,"lenovo","50000");
//		System.out.print(lap.amount);
		swap(desk,lap);
		desk.view();
		lap.view();
	}
	 static void swap(product1 desk,product1 lap)
	{
		String temp = lap.amount;
		lap.amount = desk.amount;
		desk.amount = temp;
	}

}
