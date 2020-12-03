package com.heraizen.cj.day6.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.heraizen.cj.day6.commonexception.CommonExecption;

public class QuestionContainer {
	Scanner sc = new Scanner(System.in);
int crct;
int wrong;

	List<Question> list= new ArrayList<Question>();
	List<String> ans = new ArrayList<String>();
	
	QuestionContainer()
	{
		list.add(new Question("java is program or platform","Program","Platform","Both","none of these above","c"));
		
		list.add(new Question("who is indian prime minister","Raghul Gandhi","Soniya Gandhi","Modi","Amisha","c"));
		
		list.add(new Question("who is TamilNadu prime minister","EPS","OPS","MKS","SEEMAN","A"));
		
		list.add(new Question("who is Indian Cricket Team Captian","Dhoni","Kholi","Rohit","Raghul","B"));
		
		list.add(new Question("who is Former Indian Cricket Team Captian","Dhoni","Kholi","Rohit","Raghul","A"));
	}
	
	void beginTest()
	{
		list.forEach(q->{
			
			System.out.println(q.Question);
			System.out.printf("A) %-15s   C) %-15s\n",q.option1,q.option3);
			System.out.printf("B) %-15s   D) %-15s\n",q.option2,q.option4);
			System.out.println();
			String a = choose();
//			try {
//			if(!(a.equalsIgnoreCase("A")||a.equalsIgnoreCase("B")||a.equalsIgnoreCase("C")||a.equalsIgnoreCase("D")))
//			{
//				throw new CommonExecption("Please Choose valid option");
//			}
//			}
//			catch(CommonExecption e)
//			{
//				
//			}
			
		if(a.equalsIgnoreCase(q.answer))
		{
			crct++;
		}
		else
		{
			wrong++;
		}
		});
	}
	
	String choose()
	{
		int n = 0;
		String a = sc.next();
		try {
			if(!(a.equalsIgnoreCase("A")||a.equalsIgnoreCase("B")||a.equalsIgnoreCase("C")||a.equalsIgnoreCase("D")))
			{
				throw new CommonExecption("Please Choose valid option");
			}
			}
			catch(CommonExecption e)
			{
				a = choose();
			}
		
		return a;
	}
	
	void showresult()
	{
		System.out.printf("Total Question : %d  \n ",list.size());
		System.out.printf("Correct : %d  \n ",crct);
		System.out.printf("Wrong : %d  \n ",wrong);
		
		System.out.printf("Result : %s \n ",(crct*100/list.size())>40?"Pass":"Fail");
	}
}
