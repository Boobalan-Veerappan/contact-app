package com.heraizen.cj.day6.state_captial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StateCollection {

	Map <String, String> state_capital = new HashMap<String, String>(); 
	
	void add_State_captial(String state,String capital)
	{
		state_capital.put(state,capital);
		
	Set<String> states = state_capital.keySet();
	System.out.println(states);
	}
	void viewCapital(String state)
	{
		List<String> captial = new ArrayList();
		int i=0;
		state_capital.forEach((st,cp)->{
			
			if(state.equalsIgnoreCase(st))
			{
				captial.add(cp);
			}
		});
		
		if(captial.isEmpty())
		{
			System.out.println(" No States are Found");
		}
		else
		{
			System.out.println(state+" Captial is " +captial);
		}
	}
}
