package com.thoughtworks.biblioteca.command;

import com.thoughtworks.biblioteca.view.View;

public class LibraryNoCommand implements Command {
	
private View view;
	
	public LibraryNoCommand(View view){
		this.view = view;
	}

	@Override
	public void execute() {
		view.displayLibrayNumber();
		
	}

}
