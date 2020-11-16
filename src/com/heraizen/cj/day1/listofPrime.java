package com.heraizen.cj.day1;

import java.util.Scanner;

public class listofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int low,up,m=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower bound value:");
		low = sc.nextInt();
		System.out.println("Enter the lower bound value:");
		up = sc.nextInt();
		System.out.print("The prime numbers between "+low+" and "+ up +" are ");
		for(int i=low;i<=up;i++)
		{
			m=0;
			for(int j=2;j<i;j++)
			{
				if(i%j == 0 )
				{
					
					m =1;
					break;
				}
				else
				{
					m=0;
				}
			}
			if(m==0&&i!=1)
			{
				System.out.print(i+" ");
				m=0;
			}
			
				
			
		}
	}

}
