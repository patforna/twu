package com.thoughtworks.biblioteca.command;

import com.thoughtworks.biblioteca.domain.Login;

public class LogOutCommand implements Command{
private Login login;
	
	public LogOutCommand(Login login){
		
		this.login =login;
		
	}

	@Override
	public void execute() {
		login.logoutUser();
		
	}

	
}
