package com.durgasoft.springaop_05;

public class Bank {
	
	private String currency = "$";
	private int amount = 5000;
	private String accountNo = "012NIBL";
	
	/** Deposit given Amount to account number
	 * 
	 * @param accNo Account Number
	 * @param amount Amount to deposit
	 * @return Total balance after deposit
	 */
	public int deposit(String accNo, int amount) {
		
		if (accNo.equals(this.accountNo)) {
			
			System.out.println("in deposit method.");
			this.amount = this.amount + amount;
			return this.amount;
		} else {
			throw new AccountNotFoundException();
		}
	}
	
	/** Shows avaible balace 
	 * 
	 * @param accNo Account number
	 */
	public void showBalance(String accNo) {
		if (accNo.equals(this.accountNo)) {
			System.out.println("Available Balance : "+currency + amount);
		}
	}

}
