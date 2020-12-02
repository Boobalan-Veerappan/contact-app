package com.heraizen.cj.day6.store;

public class MyNumber {
	private int firstNumber;
	private int secondNumber;
	double result;

	MyNumber(int a, int b) {
		this.firstNumber = a;
		this.secondNumber = b;
	}

	void add() {
		this.result = firstNumber + secondNumber;
		System.out.println("sum of Number " + result);
	}

	void sub() {
		this.result = firstNumber - secondNumber;
		System.out.println("sum of Number " + result);
	}

	void mul() {
		this.result = firstNumber * secondNumber;
		System.out.println("sum of Number " + result);
	}

	void div() {
		try {
			this.result = firstNumber / secondNumber;
			System.out.println("sum of Number " + result);
		} catch (ArithmeticException e) {
			System.out.println("in divison is " + e.getMessage());
		}
	}
}
