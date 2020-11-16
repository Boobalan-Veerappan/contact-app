package com.heraizen.cj.day1;
import java.util.Scanner;

public class gradeMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sub1,sub2,sub3,average;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks scored in 1st subject:");
sub1=sc.nextInt();
System.out.println("Enter the marks scored in 2nd subject:");
sub2=sc.nextInt();
System.out.println("Enter the marks scored in 3rd subject:");
sub3=sc.nextInt();
System.out.println("Total marks: "+(sub1+sub2+sub3));
System.out.println("Average is: "+(sub1+sub2+sub3)/3);
average = (sub1+sub2+sub3)/3;
if((sub1+sub2+sub3)/3 <=35)
{
	System.out.println("Grade: \"C\"");
}
else if(60 >=average && average>35 )
{
	System.out.println("Grade: \"B\"");
}
else {
	
	System.out.println("Grade: \"A\"");
	
}

	}

}
