package com.heraizen.cj.day1;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the number to generate its multiplication table:");
		n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+" "+(i*n));
		}
		
	}

}
