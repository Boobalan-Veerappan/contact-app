package com.heraizen.cj.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetElement {
	static int m=0;
	public static void main(String[] args) {
		String[] names = { "Tushar", "Anand", "chutiya" };
Set<String> setNames = new HashSet<>(Arrays.asList(names)); 
		
		
		checkName(setNames,"Tushar").forEach(System.out::println);

	}
	public static Set<String> checkName(Set<String> nameList,String name ) {

//		if(nameList.stream().anyMatch((s)-> s.equalsIgnoreCase(name))) {
//			System.out.printf("\nFind the name Match ' %s ' in the set\n\n",name);
//		  nameList.remove(name);	
//		}else {
//			System.out.println("Don't Find name the Match ");
//		}
		m=0;
		Set<String> setNames = new HashSet<>(); 
		nameList.forEach(e->{
			
			if(!e.equalsIgnoreCase(name))
			{
				m=1;
				
				setNames.add(e);
				
			}
			
		});
		
		if(m == 0)
		{
			System.out.println("Not Match String Found");
		}
//		
		
		return setNames;

	}
}
