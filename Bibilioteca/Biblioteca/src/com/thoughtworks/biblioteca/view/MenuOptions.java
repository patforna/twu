package com.thoughtworks.biblioteca.view;

import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.biblioteca.command.BookCatalogCommand;
import com.thoughtworks.biblioteca.command.BooksCheckOutCommand;
import com.thoughtworks.biblioteca.command.Command;
import com.thoughtworks.biblioteca.command.LibraryNoCommand;
import com.thoughtworks.biblioteca.command.LogOutCommand;
import com.thoughtworks.biblioteca.command.LoginCommand;
import com.thoughtworks.biblioteca.command.MovieCatalogCommand;
import com.thoughtworks.biblioteca.domain.Login;
import com.thoughtworks.biblioteca.domain.User;

public class MenuOptions {
	
	private Map<String,Command> commands = new HashMap<String, Command>();
	
	public MenuOptions(){
		commands.put("1", new BookCatalogCommand(new View()));
		commands.put("2", new BooksCheckOutCommand(new View()));
		commands.put("3", new LibraryNoCommand(new View()));
		commands.put("4", new MovieCatalogCommand(new View()));
		commands.put("5", new LoginCommand(new Login(new User(), new Console())));
		commands.put("6", new LogOutCommand(new Login(new User(), new Console())));
	}
	
	public Command getCommand(String option)
	{
		return commands.get(option);
	}
	}


