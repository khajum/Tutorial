package com.durgasoft.springaop_03;

public class AccountNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		return "Account Number Invalid";
	}
}
