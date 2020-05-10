package com.durgasoft.springaop_03;

public class Bank {
	
	private int amount = 5000;
	private String accountNo = "012NIBL";
	
	public int deposit(String accNo, int amount) {
		
		if (accNo.equals(this.accountNo)) {
			
			System.out.println("in deposit method.");
			this.amount = this.amount + amount;
			return this.amount;
		} else {
			throw new AccountNotFoundException();
		}
	}

}
