package com.rlimbu.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return (user.equalsIgnoreCase("rlimbu") && password.equals("dummy"));
	}

}
