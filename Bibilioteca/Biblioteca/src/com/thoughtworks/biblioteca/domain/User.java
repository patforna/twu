package com.thoughtworks.biblioteca.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.thoughtworks.constants.Constants;

public class User {

	private String username;
	public User()
	{
		
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean authenticateUser(String username, String password) {
		try {
			BufferedReader reader = null;

			reader = new BufferedReader(new FileReader(Constants.LOGIN));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String libraryNo = line.substring(0, line.indexOf(" "));
				String memberPassword = line.substring(line.indexOf(" ") + 1);

				if ((libraryNo.equals(username))
						&& (memberPassword.equals(password))) {
					return true;
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Bad filename."
					+ "Check the name of the file and try again");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String getLibraryNumberOfUser()
	{
		
		return Constants.CURRENTUSER;		
	}

	private String password;

}
