package com.heraizen.cj.day6.member;

import java.util.ArrayList;
import java.util.List;

public class MemberContainer {

	int m=0,m1=0;
	Member mem;
	List<Member> list = new ArrayList<Member>();
	MemberIdGenerator mig = new MemberIdGenerator();
	void addMember(String name,String city,String country)
	{
		list.add(new Member(mig.getMemeberId(),name,city,country));
		
	}
	
	void deleteMember(String id)
	{
		list.forEach(e->{
			if(id.equalsIgnoreCase(e.mid))
			{
				list.remove(e);
			}
		});
		
		System.out.println("After Delete");
		
		list.forEach(e->{
			
			System.out.printf("Id : %-10s  name : %-10s city : %-10s country\n",e.mid,e.name,e.city,e.country);
		});
	}
	void search(String id)
	{
		m=0;
		if(!list.isEmpty())
		{
			list.forEach(e->{
				
				if(id.equalsIgnoreCase(e.mid))
				{
					m=1;
					mem = e;
					System.out.printf("Id : %-10s  name : %-10s city : %-10s country\n",e.mid,e.name,e.city,e.country);
				}
			});
		}
		else
		{
			System.out.println("List is Empty");
		}
		
		if(!list.isEmpty()&&m==0)
		{
			System.out.println("Sorry not found");
		}
	}
	
	void searchbyNameandId(String id)
	{
		m1=0;
		if(!list.isEmpty())
		{
		list.forEach(e->{
			if(e.mid.equalsIgnoreCase(id)||e.name.equalsIgnoreCase(id))
			{
			m1=0;
			System.out.printf("Id : %-10s  name : %-10s city : %-10s country\n",e.mid,e.name,e.city,e.country);
			}
			
		});
		}
		else
		{
			System.out.println("List is Empty");
		}
		if(!list.isEmpty()&&m1==0)
		{
			System.out.println("Sorry not found");
		}
	}
	
	boolean exit()
	{
		return false;
	}
	void displaysortingorder()
	{
		
		list.forEach(e->{
			System.out.println(e.name+e.mid);
		});
		
	}
}
