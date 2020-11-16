package com.heraizen.cj.day1;

import java.util.Scanner;

public class series_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int n=25;
System.out.println("Enter the any value");
n= sc.nextInt();
double k,m=0;
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	k=(1d/(i*i*i));
	m=m+k;
}
System.out.println("Result is "+m);
	}

}
