package com.heraizen.cj.day1;
import java.util.Scanner;
public class factorial_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any value :");
	int n = sc.nextInt();
	int i=0,m=1;;
	while(i!=n)
	{
		i++;
		m=m*i;
		
	}
	System.out.println("Result is :"+m);
	}

}
