package com.heraizen.cj.day6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class SetMap {

	public static void main(String[] args) {
		Integer[] list = {1001,1002,1003};	
		getMap(list).forEach((key,value)-> System.out.println(key + " " + value));

	}
	public static Map<Integer, Integer> getMap(Integer[] number) {

		Map<Integer, Integer> intergerKey = new HashMap<>(); 
		int  i=0;
		Arrays.asList(number).forEach(s -> {  intergerKey.put(ThreadLocalRandom.current().nextInt(1,10), s);});
		System.out.println(intergerKey);
		return intergerKey;

	}
}
