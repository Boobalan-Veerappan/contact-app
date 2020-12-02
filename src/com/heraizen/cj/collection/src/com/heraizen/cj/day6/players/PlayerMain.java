package com.heraizen.cj.day6.players;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerMain {

	public static void main(String[] args) {
		 Players p1 = new Players("boobalan","boobalan@gmail.com","kpm","TN",22);
		 Players p2 = new Players("Raghul","Raghul@gmail.com","kpm","TN",22);
		 Players p3 = new Players("Vinoth","Vinoth@gmail.com","kpm","TN",22);
		 Players p4 = new Players("Kavin","Kavin@gmail.com","kpm","TN",22);
		 Players p5 = new Players("Arun","Arun@gmail.com","kpm","TN",22);
		List<Players> football = Arrays.asList(p1,p2,p3,p4,p5);
		
		List<Players> cricket = Arrays.asList(p1,p2,p5);
		
		 List<Players> list = getPlayers(football,cricket);
		 
		 System.out.print("Common Player in Both games are ");
		 list.forEach(e->System.out.print(" "+e.name));
	}
public static List<Players> getPlayers(List<Players> football ,List<Players> cricket )
{
	
	List<Players> lists = new ArrayList();
	
	football.forEach(f->{
		cricket.forEach(c->{
			if(f.equals(c))
			{
			lists.add(f);
			}
		});
		
	});
	
	
	
	
	return lists;
	
}
}
