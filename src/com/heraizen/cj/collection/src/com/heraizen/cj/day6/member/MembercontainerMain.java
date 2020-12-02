package com.heraizen.cj.day6.member;

import java.util.Scanner;

import com.heraizen.cj.day6.commonexception.CommonExecption;

public class MembercontainerMain {

	
	public static void main(String[] args) {
		 MemberContainer mc = new MemberContainer();
		 Scanner sc = new Scanner(System.in);
		boolean m=true;
		while(m)
		{
			System.out.println("1)add 2)delete 3)search 4)searchName&ID 5)displaysort 6)exit");
			int n = getchoice();
			switch(n)
			{
			
			case 1:{
				
				
				System.out.println("Enter Name");
				String Name = sc.next();
				System.out.println("Enter City");
				String city = sc.next();
				System.out.println("Enter Country");
		String country = sc.next();
		mc.addMember(Name,city,country);
break;

			}
			case 2:{
				System.out.println("Enter id for delete");
				
				String Id = sc.next();
				mc.deleteMember(Id);
			}
			case 3:{
				System.out.println("Enter id for search");
				String Id = sc.next();
				mc.search(Id);
			}
			case 4:{
				System.out.println("Enter id or name for search");
				String Id = sc.next();
				mc.searchbyNameandId(Id);
			}
			
			case 5:{
				mc.displaysortingorder();
				break;
			}
			case 6:{
				
				m=mc.exit();
				break;
			}
			
			}
		}

	}

	private static int getchoice() {
		Scanner sc = new Scanner(System.in);
		
		
		
		int n=0;
		try {
			 n = sc.nextInt();
			 
		}
		catch(Exception e)
		{
		System.out.println("pls Enter correct one");
		n=0;
		}
		
		
		
		return n;
	}

}
