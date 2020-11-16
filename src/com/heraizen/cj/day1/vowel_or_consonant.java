package com.heraizen.cj.day1;
import java.util.Scanner;

public class vowel_or_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the any Charater :");
a = sc.next().charAt(0);
switch(a)
{
default:{
	System.out.println(a+" is consonant");
	break;
}
case 'a':
case 'e':

case 'i':

case 'o':

case 'u':
{
	System.out.println(a+" is Vowel");
	break;
}

}
	}

}
