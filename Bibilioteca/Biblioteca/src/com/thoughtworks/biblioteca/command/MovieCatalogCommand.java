package com.thoughtworks.biblioteca.command;

import com.thoughtworks.biblioteca.view.View;

public class MovieCatalogCommand implements Command {
	private View view;
	
	public MovieCatalogCommand(View view){
		this.view = view;
	}

	@Override
	public void execute() {
		view.displayMovieCatalog();
		
	}

}
