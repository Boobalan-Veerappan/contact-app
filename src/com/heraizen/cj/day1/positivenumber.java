package com.heraizen.cj.day1;
import java.util.Scanner;

public class positivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
num = sc.nextInt();
if(0>num)
{
	num = num*-1;
}
System.out.print("The result is: "+num);
	}

}
