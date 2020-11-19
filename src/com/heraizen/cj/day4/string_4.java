package com.heraizen.cj.day4;

import java.util.Scanner;

public class string_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		System.out.print("Enter for a search : ");
		String searchString = sc.nextLine();
		sc.close();

		String[] strArray = s.split(",");
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(searchString)) {
				System.out.println("\nfound at position: " + i);
			}
		}

	}

}
