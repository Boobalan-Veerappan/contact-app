package com.heraizen.cj.day6.state_captial;

import java.util.Scanner;

public class StateDiary {

	public static void main(String[] args) {
		StateCollection stcollect = new StateCollection();
		Scanner sc = new Scanner(System.in);
		int m=1;
		int n=0;
		while(m == 1)
		{
			System.out.println("1-Enter New State 2-view Captial 3-Exist");
			n = getchoice();
			switch(n)
			{
			case 1:{
				System.out.println("Enter the state name");
				String state = sc.next();
				System.out.println("Enter the Capital name");
				String capital = sc.next();
				stcollect.add_State_captial(state, capital);
				break;
			}
			case 2:{
				System.out.println("Enter the State name");
				String state = sc.next();
				stcollect.viewCapital(state);
				break;
			}
			case 3:{
				m=0;
				System.out.println("You Existing the Loop");
			}
			}
		}
	}
public static int getchoice()
{
	
	Scanner sc = new Scanner(System.in);
	
	int n=0;
	try {
		
		n = sc.nextInt();
		
	}catch(Exception e)
	{
		System.out.println("Please Enter the valid NUmber");
	}
	
	return n;
}
}
