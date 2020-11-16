package com.heraizen.cj.day1;

import java.util.Scanner;

public class denomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String number;

System.out.println("Enter any Number");
number = sc.nextLine();
int length = number.length();
int m=1,i=0,q;
q=Integer.parseInt(number);
while(q!=0)
{
	m=1;
	i++;
	for(int j=1;j<=length-i;j++)
	{
		m=m*10;
	}
	System.out.println((q/m)+" * "+m+" = "+(q/m)*m);
	q=q%m;
}
	}

}
