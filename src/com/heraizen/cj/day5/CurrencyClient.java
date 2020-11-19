package com.heraizen.cj.day5;

import java.util.Scanner;

public class CurrencyClient {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the String");
	String country = sc.nextLine();
	Currency c = CurrencyContainer.getCurrency(country);
	System.out.println(country+"  country currency is "+c.getCurrency());
	}

}
class CurrencyContainer{
	static Currency getCurrency(String country)
	{
		Currency c = null;
		if(country .equalsIgnoreCase( "India"))
		{
			c =  new India();
		}
		else if(country.equalsIgnoreCase("USA"))
		{

			c =   new USA();
		}
		else if(country .equalsIgnoreCase( "UK"))
		{
			c =   new UK();
		}
		
		return c;
	}
}
class India implements Currency{
	
	public String getCurrency()
	{
		
		return "INR(Rupess)";
	}
	
}
class UK implements Currency{
	
	public String getCurrency()
	{
		
		return "Pound";
	}
	
}
class USA implements Currency{
	
	public String getCurrency()
	{
		
		return "Dollar";
	}
	
}

