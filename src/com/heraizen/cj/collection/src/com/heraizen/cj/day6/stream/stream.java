package com.heraizen.cj.day6.stream;

import java.util.*;
import java.util.function.Consumer;

public class stream {

	private static Consumer<? super Integer> c;

	public static void main(String[] args) {
	
		List<Integer> value = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		Consumer<Integer> c= new Consumer<Integer>()
				{

					@Override
					public void accept(Integer T) {
						System.out.println(Integer.toHexString(T.hashCode()));
						
					}
			
				};
	
	
				value.forEach(c);
	}

}

