package com.durgasoft.springaop_01;

public class AccountNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		return "Account Number Invalid";
	}
}
