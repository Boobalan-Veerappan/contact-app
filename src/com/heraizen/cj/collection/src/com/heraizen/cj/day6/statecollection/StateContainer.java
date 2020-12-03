package com.heraizen.cj.day6.statecollection;

import java.util.Scanner;

import com.heraizen.cj.day6.commonexception.CommonExecption;

public class StateContainer {

	public static void main(String[] args) {
		Stateinfo stinfo = new Stateinfo();
		Scanner sc = new Scanner(System.in);
		int m=1;
int k=0;
		while(m==1)
		{
			System.out.println("1-Enter the State 2-Exist");
 k=getchoice();
 
 switch(k)
 {
 case 1:{
		String state = sc.next();
		stinfo.addState(state);	
 }
 case 2:{
	 m=0;
		stinfo.viewStates();
		System.out.println("thank you sir");
 }
 }
			
			
			
		}

	}
public static int getchoice()
{
	Scanner sc = new Scanner(System.in);
	int n=0;
	try {
		n=sc.nextInt();
		if(n>2||n<0)
		{
			throw new CommonExecption("Please enter the value less the 3 and greater 0");
		}
	}
	catch(CommonExecption ce)
	{
		n=0;
	}
	catch(Exception e)
	{
		System.out.println("Please Enter the Valid Number");
	n=0;
	}
	return n;
}
}
