package com.heraizen.cj.day6;
import java.util.*;

import com.heraizen.cj.day6.commonexception.CommonExecption;
public class ShowElements {

	public static void main(String[] args) {
		
List <String>list = new ArrayList();
	String str;
	int m=1;
	int n = 0;
	Scanner sc = new Scanner(System.in);
	
	while(m == 1)
	{
		System.out.println("1) Enter string  2) Exit Enter");
		
		
		 n =getchoice();
		
		
		
		switch(n)
		{
		case 1:
		{
			System.out.println("Enter the String");
			try {
			str = sc.next();
			list.add(str);
			}
			catch(Exception e)
			{
				System.out.print("enter valid");
			}
		break;
		}
		case 2:{
			System.out.println("Existing the Loop");
			m=0;
			break;
		}
		default:
			System.out.println("Pease enter the valid Answer");
	}
	
		
			
		
		
	}
	
ShowList(list);
}
	 static void ShowList(List<String> list)
	{
		list.forEach(i ->System.out.println(i));
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
