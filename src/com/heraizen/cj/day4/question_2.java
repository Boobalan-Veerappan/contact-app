package com.heraizen.cj.day4;

class add  {
	
	void sum(int a,int b)
	{
		System.out.println("sum of the two Number : "+(a+b));
	}
}

class calculatesum extends add{
	void sum(int a,int b,int c)
	{
		System.out.println("sum of the two Number : "+(a+b+c));
	}
}
public class question_2 {

	public static void main(String[] args) {

		calculatesum a = new calculatesum();
a.sum(1, 2);
a.sum(10, 20, 30);

	}

}
