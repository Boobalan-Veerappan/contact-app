package com.heraizen.cj.day6.statecollection;

import java.util.Scanner;

public class StateContainer {

	public static void main(String[] args) {
		Stateinfo stinfo = new Stateinfo();
		Scanner sc = new Scanner(System.in);
		int m=1;
int k=0;
		while(m==1)
		{
			System.out.println("1-Enter the State 2-Exist");
 k=sc.nextInt();
			if(k ==1)
			{
				String state = sc.next();
				stinfo.addState(state);	
			}
			else
			{
				m=0;
				stinfo.viewStates();
				System.out.println("thank you sir");
			}
			
			
		}

	}

}
