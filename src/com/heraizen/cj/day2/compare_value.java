package com.heraizen.cj.day2;

import java.util.Scanner;

public class compare_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the two Number value between 1 to 50 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = 5;
		int a1=0;
		int b1=0;
		int []arr = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = (int) (Math.random() * (50 - 1 + 1) + 1); 
		}
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			if(a == arr[i])
			{
				a1=1;
			}
			if(b == arr[i])
			{
				b1=1;
			}
		}
		
		if(a1 == 1 && b1==1)
		{
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
