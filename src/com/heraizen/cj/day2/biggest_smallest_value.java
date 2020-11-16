package com.heraizen.cj.day2;

import java.util.Scanner;

public class biggest_smallest_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the N number :");
int n = sc.nextInt();
int []a = new int[n];
for(int i=0;i<n;i++)
{
	a[i] = sc.nextInt();
}
int smallest=a[0];
for(int i=1;i<n;i++)
{
	if(smallest>a[i])
	{
	 smallest = a[i];
	}
}
int largest = a[0];
for(int i=0;i<n;i++)
{
	if(largest<a[i])
	{
		largest = a[i];
	}
}
System.out.println("Smallest :"+smallest);
System.out.println("Largest :"+largest);
	}

}
