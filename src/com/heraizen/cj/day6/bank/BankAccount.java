package com.heraizen.cj.day6.bank;

public class BankAccount {
	private int accNO;
	private String custName;
	private String accType;
	private float balance;

	BankAccount(int accNO, String custName, String accType, float balance) {
		this.accNO = accNO;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	void deposit(float amt) {
		try {
			if (amt < 0) {
				throw new NegativeAmountException("you should not enter negative amount");
			} else {
				balance = balance + amt;
			}
		} catch (NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
	}

	void withdraw(float amt) {
		try {
			if (amt < 0) {
				throw new NegativeAmountException("you should not enter negative amount");
			} else {
				try {
					if (amt <= balance) {
						if (accType.equalsIgnoreCase("saving")) {
							try {
								if (balance - amt < 1000) {
									throw new MinimumBalanceException("Minimun Balance for the Saving Account is 1000");
								} else {
									balance = balance - amt;
								}
							} catch (MinimumBalanceException mb) {
								System.out.println(mb.getMessage());
							}
						}
						if (accType.equalsIgnoreCase("current")) {
							try {
								if (balance - amt < 5000) {
									throw new MinimumBalanceException(
											"Minimun Balance for the current Account is 5000");
								} else {
									balance = balance - amt;
								}
							} catch (MinimumBalanceException mb) {
								System.out.println(mb.getMessage());
							}
						}
					} else {
						throw new InsufficientException("your Account Balance is insufficient");
					}
				} catch (InsufficientException ise) {
					System.out.println(ise.getMessage());
				}
			}
		} catch (NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
	}

	float getBalance() {
		if (accType.equalsIgnoreCase("saving")) {
			try {
				if (balance < 1000) {

					throw new LowBalanceException(
							"your saving Account Balance is " + balance + " only but minimum balance is 1000");
				}

			} catch (LowBalanceException lbe) {
				System.out.println(lbe.getMessage());
			}
		}
		if (accType.equalsIgnoreCase("current")) {
			try {
				if (balance < 5000) {

					throw new LowBalanceException(
							"your current Account Balance is " + balance + " only but minimum balance is 5000");
				}

			} catch (LowBalanceException lbe) {
				System.out.println(lbe.getMessage());
			}
		}
		return balance;
	}
}
