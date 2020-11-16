package com.heraizen.cj.day1;
import java.util.Scanner;
public class series_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n=7;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the any Value");
n=sc.nextInt();
double sum=0,k=0;
for(int i=1;i<=n;i++)
{
	k=1d/i;
	sum=sum+k;
	
}
System.out.print("Result of the Series sum is "+sum+" ");
	}

}
