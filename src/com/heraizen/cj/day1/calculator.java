package com.heraizen.cj.day1;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num1, num2,n;
System.out.println("Enter the 1st Operand num1:");
num1=sc.nextInt();
System.out.println("Enter the 2nd Operand num2:");
num2=sc.nextInt();
System.out.println("1. add 2. mul 3. div 4. mod 5. div");
System.out.println("Enter the operator");
n = sc.nextInt();
switch(n)
{
case 1:{
	System.out.println("The Sum of "+num1+" and "+num2+" is "+(num1+num2));
	break;
}
case 2:{
	System.out.println("The Subraction of "+num1+" and "+num2+" is "+(num1-num2));
	break;
}
case 3:{
	
	System.out.println("The multiplication of "+num1+" and "+num2+" is "+(num1*num2));
	break;
}
case 4:{
	System.out.println("The division of "+num1+" and "+num2+" is "+(num1/num2));
	break;
}
case 5:{
	System.out.println("The division of "+num1+" and "+num2+" is "+(num1%num2));
	break;
}
default:{
	System.out.println("None");
	break;
}

}
	}

}
