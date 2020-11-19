package com.heraizen.cj.day4;

import java.util.Scanner;
class simple{
	int sum1=0;
	int sum(int n, int i)
	{
		if(n>=i) {
		sum1 =sum1+i;
		i++;
		sum(n,i);
	}
		else {
			return sum1;
		}
		return sum1;
	}
}
public class product {

	public static void main(String[] args) {

		// GCD
				System.out.println(" GCD ");
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter value 1: ");
				int a = sc.nextInt();
				System.out.print("Enter value 2: ");
				int b = sc.nextInt();
				int GCD = gcd1(a, b);
				System.out.println("GCD of given numbers is: " + GCD);

				// Fibinacci
				System.out.println("\n Fibonacci");

				Scanner sc1 = new Scanner(System.in);
				System.out.print("Enter number: ");
				int N = sc1.nextInt();
				int a1 = 0, b1 = 1, temp = 0;
				System.out.print(a1 + " " + b1 + " ");
				int F = N;
				while (F > 0) {
					temp = a1 + b1;
					a1 = b1;
					b1 = temp;
					if (temp <= F) {
						System.out.print(temp + " ");
					} else {
						break;
					}
				}
				sc.close();

				// Sum of N natural numbers
				//System.out.println("\n\nsum of N natural numbers -------->");
				int sum = 0;
				simple s = new simple();
				System.out.println("\nThe sum of N  numbers is: " + s.sum(N,0));

			}

			public static int gcd1(int a, int b) {
				if (b != 0) {

					return gcd1(b, a % b);
				} else

				{
					return a;
				}

	}

}
