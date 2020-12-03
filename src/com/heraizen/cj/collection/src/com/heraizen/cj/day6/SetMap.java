package com.heraizen.cj.day6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class SetMap {

	public static void main(String[] args) {
		List<Integer> number =Arrays.asList(1001,1002,1003);	
		getMap(number).forEach((key,value)-> System.out.println(key + " " + value));

	}
	public static Map<Integer, Integer> getMap(List<Integer> number) {

		Map<Integer, Integer> Mapvalue = new HashMap<>(); 
		int  i=0;
		number.forEach(s -> {
			
			
			Mapvalue.put(ThreadLocalRandom.current().nextInt(1,10), s);
		
		});

		return Mapvalue;

	}
}
