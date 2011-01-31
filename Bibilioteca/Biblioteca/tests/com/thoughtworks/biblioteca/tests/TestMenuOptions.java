package com.thoughtworks.biblioteca.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.biblioteca.command.BookCatalogCommand;
import com.thoughtworks.biblioteca.command.BooksCheckOutCommand;
import com.thoughtworks.biblioteca.command.Command;
import com.thoughtworks.biblioteca.view.MenuOptions;
import com.thoughtworks.biblioteca.view.View;

public class TestMenuOptions {
	private Map<String,Command> commands = new HashMap<String, Command>();
	MenuOptions menu;
	
	
	@Before
	public void setUp() throws Exception {
		commands.put("1", new BookCatalogCommand(new View()));
		commands.put("2", new BooksCheckOutCommand(new View()));
		menu= new MenuOptions();
	}

	@Test
	public void shouldReturnCommand(){
		assertEquals(new BooksCheckOutCommand(new View()), menu.getCommand("2"));
		
	}
	

}
