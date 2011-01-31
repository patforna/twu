package com.thoughtworks.biblioteca.view;

import com.thoughtworks.biblioteca.command.Command;

public class Menu {
	
	
	private Command command;
	
	public Menu(Command command){
		this.command = command;
	}
	
	public void optionSelected()
	{
		command.execute();
	}	
	
	public static void main(String[] args) {
		while (true) {
			Console c = new Console();
			c.displayMenuOptions();
			MenuOptions option = new MenuOptions();
			String optionSelected =  c.readInput();
			Menu m = new Menu(option.getCommand(optionSelected));
			m.optionSelected();

		}
		}
	}


