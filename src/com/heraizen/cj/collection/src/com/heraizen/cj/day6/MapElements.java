package com.heraizen.cj.day6;

import java.util.HashMap;
import java.util.Map;

public class MapElements {

	public static void main(String[] args) {
		
		String [] name = {"Raghul","Boobalan","Kavin","Kumar","Deepak","Arun"};
	
		Map<Integer,String> maps = new HashMap<Integer,String>();
		int i=0;
		for(String n : name)
		{
			i++;
			maps.put(i,n);
		}
		
		view(maps);
	}
	public static void view(Map<Integer,String> map) {
		
		map.forEach((key,val)-> System.out.printf("\n%d = %s\n",key,val));
		
	}
}
