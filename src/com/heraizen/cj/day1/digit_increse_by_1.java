package com.heraizen.cj.day1;

import java.util.Scanner;

public class digit_increse_by_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		String number =sc.nextLine();
		int length = number.length();
		int n = Integer.parseInt(number);
		int i=0,m=1,sum=0,k=0;
		while(i!=length)
		{
			i++;
			m=1;
			for(int j=1;j<=length-i;j++)
			{
				m=m*10;
			}
			if((n/m)!=9)
			{
			sum=(((n/m)+1)*m)+sum;
			}
			
			n=n%m;
		
			
		}
		System.out.println(sum+" ");
		
		
	}

}
