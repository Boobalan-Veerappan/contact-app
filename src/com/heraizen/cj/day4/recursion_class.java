package com.heraizen.cj.day4;

import java.util.Scanner;
class fact{
int m=1;
	
	int retu(int n,int i)
	{
		if(n!=i)
		{i++;
			m=m*i;
			
			
			retu( n, i);
		}else {
			return m;	
		}
		
		return m;
	}
}

public class recursion_class {

	public static void main(String[] args) {
		System.out.println("ENter the N number");
		Scanner sc =new Scanner(System.in);
fact f = new fact();
int n = sc.nextInt();
int fact = f.retu(n,0);
System.out.print("Factorial of "+n+" is "+fact);
	}

}
