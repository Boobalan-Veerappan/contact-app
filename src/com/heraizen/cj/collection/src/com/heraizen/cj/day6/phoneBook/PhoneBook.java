package com.heraizen.cj.day6.phoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook implements PhonebookClient {
	String find = null;
	Map<String, String> map = new HashMap<>();
	@Override
	public void addDetails(String phone, String name) {
	
		map.put(phone,name );
		
	}

	@Override
	public String getName(String phone) {
		
	map.forEach((p,n)->{
		

		if(phone.equalsIgnoreCase(p))
		{
			find = n;
		}
	});
		
		
		return find;
	}

	@Override
	public int quit() {

		
		
		return 0;
	}

}
