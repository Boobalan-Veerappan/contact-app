package com.heraizen.cj.day4;
class student1{
	String id;
	String name;
	int sub[] = {1,2,3};
	void calculateSum(int[] a)
	{
		sub =a;
	}
void sum()
{
	int sum=0;
	for(int a:sub)
	{
		sum = sum+a;
	}
	System.out.println("sum of the total is"+sum);
}
}
public class calculation_sum {

	public static void main(String[] args) {
		
student1 s = new student1();
s.calculateSum(new int[] {1,2,3,4,5,6});
s.sum();
	}

}
