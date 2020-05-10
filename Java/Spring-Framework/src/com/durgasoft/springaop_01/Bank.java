package com.durgasoft.springaop_01;

public class Bank {
	
	private int amount = 5000;
	private String accountNo = "012NIBL";
	
	public int deposit(String accNo, int amount) {
		
		System.out.println("in deposit method.");
		if (accNo.equals(this.accountNo)) {
			
			this.amount = this.amount + amount;
			return this.amount;
		} else {
			throw new AccountNotFoundException();
		}
	}

}
