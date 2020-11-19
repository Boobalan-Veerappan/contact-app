package com.heraizen.cj.day4;

import java.util.Scanner;

public class string_check {

	public static void main(String[] args) 
		{  
		      String original, reverse = ""; // Objects of String class  
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string");  
		      original = in.nextLine();   
		      int length = original.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse))  
		         System.out.println(" string is a palindrome.");  
		      else  
		         System.out.println(" string n't  palindrome.");   
		   }  
}


