package com.heraizen.cj.day1;

import java.util.Scanner;

public class matrix_3_X_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int array[][] = new int[3][3];
		System.out.println("Enter 3 X 3 Matrix :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		int h=0,l=0,sum=0;
		h=array[0][0];
		l=array[0][0];
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				sum = sum+array[i][j];
				if(h<array[i][j])
				{
					h=array[i][j];
				}
				if(l>array[i][j])
				{
					l=array[i][j];
				}
			}
		}
		System.out.println("Highest Number is : "+h);
		System.out.println("Lowest Number is : "+l);
		System.out.println("Sum of the Array is : "+sum);
		
	}

}
