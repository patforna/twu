package com.thoughtworks.biblioteca.command;

import com.thoughtworks.biblioteca.domain.Login;

public class LoginCommand implements Command{
	private Login login;
	
	public LoginCommand(Login login){
		
		this.login =login;
		
	}

	@Override
	public void execute() {
		login.loginUser();
		
	}

}
