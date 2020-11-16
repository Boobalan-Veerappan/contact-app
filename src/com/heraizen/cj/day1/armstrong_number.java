package com.heraizen.cj.day1;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
String number;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Number: ");
number=sc.nextLine();
int length = number.length();
n = Integer.parseInt(number);
while(n!=0)
{
	int m=1;
	for(int i=1;i<=length;i++)
	{
		m=m*(n%10);
	}
	sum=sum+m;
	n=n/10;
}
if(sum == Integer.parseInt(number))
{
	System.out.print(sum+" is an Armstrong number ");
	n = Integer.parseInt(number);
	int i=0,multi=1;
	while(i!=length)
	{
		i++;
		multi=1;
		for(int j=1;j<=length-i;j++)
		{
			multi = 10*multi;
		}
		int m=n%multi;
		n=n/multi;
		System.out.print(n+"^"+length);
		if(i!=length)
		{
			System.out.print(" +");
		}
		else
		{
			System.out.print(" = ");
		}
		n=m;
	}
	System.out.print(sum+"");
	
}
else
{
	System.out.println(Integer.parseInt(number)+" is not an Armstrong number ");
}

	}

}
