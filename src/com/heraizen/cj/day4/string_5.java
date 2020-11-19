package com.heraizen.cj.day4;

import java.util.Scanner;

public class string_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		int letter = 0, digit = 0, space = 0;

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				digit++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			}
		}
		System.out.println("letters: " + letter);
		System.out.println("digits: " + digit);
		System.out.println("white spaces: " + space);
		sc.close();

	}

}
