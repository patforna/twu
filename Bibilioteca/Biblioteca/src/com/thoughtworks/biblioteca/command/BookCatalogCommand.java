package com.thoughtworks.biblioteca.command;

import com.thoughtworks.biblioteca.view.View;

public class BookCatalogCommand implements Command{
private View view;
	
	public BookCatalogCommand(View view){
		this.view = view;
	}

	@Override
	public void execute() {
		view.displayBooks();
		
	}


}
