package com.thoughtworks.biblioteca.command;

import com.thoughtworks.biblioteca.view.View;


public class BooksCheckOutCommand implements Command {
	
	private View view;
	
	public BooksCheckOutCommand(View view){
		this.view = view;
	}

	@Override
	public void execute() {
		view.checkoutBooks();
		
	}

}
