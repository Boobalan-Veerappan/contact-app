package com.heraizen.cj.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetElement {
	static int m=0;
	public static void main(String[] args) {
		String[] names = { "raghul", "boobalan", "kavin","vinoth" };
Set<String> setNames = new HashSet<>(Arrays.asList(names)); 
Scanner sc = new Scanner(System.in);		
String find = sc.next();
		
		checkName(setNames,find).forEach(i->System.out.println(i));

	}
	public static Set<String> checkName(Set<String> nameList,String name ) {

		m=0;
		Set<String> setNames = new HashSet<>(); 
		nameList.forEach(e->{
			
			if(!e.equalsIgnoreCase(name))
			{
			
				
				setNames.add(e);
				
			}
			else {
				m=1;
			}
			
		});
		
		if(m == 0)
		{
			System.out.println("Not Match String Found");
		}
	
		
		return setNames;

	}
}
