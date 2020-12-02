package com.heraizen.cj.day6.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount(10001, "BOOBALAN", "SAVING", 100);
		System.out.println("1.Deposit\t2.Withdraw\t3.Check Balance");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			ba.deposit(-1);
			break;
		case 2:
			ba.withdraw(1);
			break;
		case 3:
			ba.getBalance();
			break;
		}

	}

}
