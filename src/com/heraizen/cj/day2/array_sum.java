package com.heraizen.cj.day2;

import java.util.Scanner;

public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the N value");
int n = sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
	sum+=a[i];
}
System.out.println("Sum of the arry is "+sum);
	}

}
