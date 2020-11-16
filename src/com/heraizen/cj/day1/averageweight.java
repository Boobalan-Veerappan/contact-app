package com.heraizen.cj.day1;
import java.util.Scanner;

public class averageweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first,second,third;
Scanner sc =new Scanner(System.in);

System.out.println("Enter the weight of the first person:");
first = sc.nextFloat();
System.out.println("Enter the weight of the second person:");
second = sc.nextFloat();
System.out.println("Enter the weight of the third person:");
third = sc.nextFloat();
System.out.printf("The sum of weight of the 3 person is "+(first+second+third)+" Kgs and the average weight is %.2f",((first+second+third)/3));
	}

}
