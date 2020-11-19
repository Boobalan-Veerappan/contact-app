package com.heraizen.cj.day4;

import java.util.Scanner;

public class choice_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		System.out.println("\n\t1. Factorial\t2. Table\t3. Prime or Not");
		System.out.println("---------------------------------------------------------------------------");
		System.out.print("Enter your choice: ");
		int choise = sc.nextInt();
		sc.close();

		switch (choise) {
		case 1:
			int temp = N, fact = 1;
			while (temp > 0) {
				fact *= temp;
				temp--;
			}
			System.out.println("The factorial of given number: " + fact);
			break;

		case 2:
			int i;
			for (i = 1; i <= 10; i++) {
				System.out.println(N + " * " + i + " = " + (N * i));
			}
			break;

		case 3:
			if (N > 1) {
				for (int k = 2; k < N; k++) {
					if (N % k == 0) {
						System.out.println("The given number is not a prime number");
						return;
					}
				}
				System.out.println("The given number is a prime number");
			}
			break;
		}

	}

}
