package com.heraizen.cj.day4;

import java.util.Scanner;

public class string_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		int vowels = 0, consonants = 0;

		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isAlphabetic(arr[i])) {
				char ch = arr[i];
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("no.of vowels in the given string      :" + vowels);
		System.out.println("no. of consonants in the given string :" + consonants);
		sc.close();

	}

}
