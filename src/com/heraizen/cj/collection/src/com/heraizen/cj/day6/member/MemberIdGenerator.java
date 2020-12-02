package com.heraizen.cj.day6.member;

public class MemberIdGenerator {

	private static int count=5005;
	public static String suffix="IND";
	public static String prifix="ASHO";
	public static String getMemeberId(){
		
		count++;
		 return suffix+count+prifix;
	}
	
	
}
