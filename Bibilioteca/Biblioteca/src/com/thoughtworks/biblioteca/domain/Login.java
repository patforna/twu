package com.thoughtworks.biblioteca.domain;

import com.thoughtworks.biblioteca.view.Console;
import com.thoughtworks.constants.Constants;

public class Login {

	private User user;
	private Console console;

	public Login(User user, Console console) {
		this.user = user;
		this.console = console;
	}

	public void loginUser() {
		
		String username = "", password = "";
		username = console.readInput();
		password = console.readInput();

		if (user.authenticateUser(username, password)) {
			console.loginSuccess();
			Constants.CURRENTUSER = username;
		} else {
			console.loginFail();
		}

	}

	public void logoutUser() {
		if (!Constants.CURRENTUSER.equals(""))
			console.logoutSuccess();
		console.logOut();

	}
}
