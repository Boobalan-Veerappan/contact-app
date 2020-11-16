package com.heraizen.cj.day2;

import java.util.Scanner;

public class TWO_Dimensional_matrix_mXn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter the N and M value");
int n = sc.nextInt();
int m = sc.nextInt();
int [][]matrix = new int[n][m];
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		matrix[i][j] = sc.nextInt();
	}
}
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		System.out.print(matrix[i][j]+" ");
		if(j!=n-1)
		{
			System.out.print(" ,");
		}
	}
	System.out.println();
}
int sum_matrix=0;
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		sum_matrix = sum_matrix+matrix[i][j];
	}
}
System.out.println("Sum of 2D Matrix is : "+sum_matrix);
int biggest_number = matrix[0][0];
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		if(biggest_number>matrix[i][j])
		{
			biggest_number = matrix[i][j];
		}
	}
}
System.out.println("Biggest Number of 2D Matrix is : "+biggest_number);
int diagonal_matrix=0;
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		if(i == j)
		{
			diagonal_matrix = matrix[i][j] + diagonal_matrix;
		}
	}
}

System.out.println("Sum of diagonal Matrix  of 2D Matrix is : "+ diagonal_matrix);

System.out.println("Matrix Transerve");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print(matrix[j][i]+" ");
		if(j!=n-1)
		{
			System.out.print(" ,");
		}
	}
	System.out.println();
}

	}

}
