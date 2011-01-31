package com.thoughtworks.biblioteca.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Console {
	
	private Map<String, String> menuOptions = new TreeMap<String, String>();
	
	public Console()
	{
		menuOptions.put("1", "List Book Catalog");
		menuOptions.put("2", "Check out Book");
		menuOptions.put("3", "Check Library Number");
		menuOptions.put("4", "List Movie Catalog");
		menuOptions.put("5", "Login");
		menuOptions.put("6", "Logout");
		
	}
	
	public Map<String, String> getMenuOptions()
	{
		return menuOptions;
	}
	
	public void formatMenuOptions()
	{
		for(int i=0; i<45; i++)
		{
		System.out.print("*") ;
		
		}
		
		
	}
	public  void displayMenuOptions() {
		formatMenuOptions();
		System.out.println();
		System.out.println("*                    Menu                    *");
		System.out.println("            ========================          ");
		for(Map.Entry<String, String> entry:getMenuOptions().entrySet())
		{
			System.out.println("*" + insertSpaces()+ entry.getKey() +"." + entry.getValue());
			
		}
		formatMenuOptions();
		System.out.println();
		System.out.println("Your Selection: ");

	}
	
	public String insertSpaces()
	{
		return (" " + " " + " " + " " + " "+ " " +" " + " ");
	}
	
	public void enterUserName()
	{
		System.out.println("Username :");
	}
	
	public void enterPassword(){
		System.out.println("Password :");
	}
	
	public void loginSuccess(){
		System.out.println("Welcome to Biblioteca");
		System.out.println("You have successfully logged on to Biblioteca");
		
	}
	
	public void loginFail(){
		System.out.println("Username or Password is incorrect. Please try again");
	}
	
	public void logoutSuccess()
	{
		System.out.println("You have been logged out of Biblioteca");
	}
	
	public void logOut()
	{
		System.out.println("You are currently not logged in");
	}
	
	public String readInput()
	{
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStream);
		String userInput = null;
		try{
			userInput = reader.readLine();
		} catch (IOException e) {
			System.out.println("Enter a valid Input");
		
		}
		
		return userInput;
	}


}
