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
		int n=0;
		Scanner sc = new Scanner(System.in);
		try {
		 n = sc.nextInt();
		if(n>6 || n<0)
		{
			n=0;
			throw new CommonExecption("Please enter valid Number should be less than 6.");
		}
		}
		catch(CommonExecption ce)
		{
			
		}
		catch(Exception e){
			System.out.println("Please enter valid Number.");
		n=0;	
		}
		return n;
	}

}
