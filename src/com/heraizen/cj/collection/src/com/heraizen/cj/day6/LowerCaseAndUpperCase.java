package com.heraizen.cj.day6;
import java.util.*;
import java.util.stream.Collectors;

import com.heraizen.cj.day6.commonexception.CommonExecption;
public class LowerCaseAndUpperCase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
int m=1;
int n=0;
Scanner sc = new Scanner(System.in);
while(m==1)
{
	System.out.println("1) Enter String 2)Exit");
	n = getchoice();
	switch(n)
	{
	case 1:{
		System.out.println("Enter the String");
		String str = sc.next();
		list.add(str);
		break;
	}
	case 2:{
		System.out.println("your EXISTING THE Loop");
		m=0;
		break;
	}
	default:{
		System.out.println("ENter the valid one");
	}
	}
}
//System.out.println(list);
list.stream().map(e->e.substring(0,e.length()/2).toUpperCase()+e.substring(e.length()/2,e.length()).toLowerCase()).forEach(players -> System.out.println(players + ""));
	}
	private static int getchoice() {
		int n=0;
		Scanner sc = new Scanner(System.in);
		try {
		 n = sc.nextInt();
		if(n>6 || n<0)
		{
			n=0;
			throw new CommonExecption("Please enter valid Number should be less than 6.");
		}
		}
		catch(CommonExecption ce)
		{
			
		}
		catch(Exception e){
			System.out.println("Please enter valid Number.");
		n=0;	
		}
		return n;
	}
}
