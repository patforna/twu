package com.thoughtworks.biblioteca.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.biblioteca.domain.User;
import com.thoughtworks.constants.Constants;

public class TestUser {
private User user;
	
	@Before
	public void setUp() throws Exception {
		 user = new User("111-1114","xyz");
	}

	@Test
	public void shouldReturnUserName(){
		assertEquals("111-1114",user.getUsername());
		
	}
	
	@Test
	public void shouldReturnUserPassword(){
		assertEquals("xyz",user.getPassword());
		
	}
	
	@Test
	public void shouldReturnLibraryNoOfUser()
	{
		Constants.CURRENTUSER="111-1114";
		assertEquals("111-1114",user.getLibraryNumberOfUser());

	}
	
	

}
