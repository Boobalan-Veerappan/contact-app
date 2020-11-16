package com.heraizen.cj.day1;
import java.util.Scanner;
public class number_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number: ");
String n= sc.nextLine();
int length = n.length();
int m=1,i=0,r=0;
int k=Integer.parseInt(n);
while(k!=0)
{
	i++;
	m=1;
	for(int j=1;j<=length-i;j++)
	{
		m=m*10;
	}
	int q=0;
	for(int f=2;f<(k/m);f++)
	{
		if((k/m)%f==0)
		{
			q=1;
		}
	}
	if(q==0 && (k/m)!=1)
	{
		r++;
	}
	k=k%m;
}
System.out.println("Number of prime digits in the entered number is "+r);
	}

}
