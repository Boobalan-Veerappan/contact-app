package com.heraizen.cj.day6.phoneBook;

public interface PhonebookClient {

	void addDetails(String phone,String name);
	String getName(String phone);
	int quit();
}
