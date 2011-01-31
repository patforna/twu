package com.thoughtworks.biblioteca.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.thoughtworks.biblioteca.domain.Movie;

public class TestMovie {
private Movie movie1, movie2;
	
	@Before
	public void setUp() throws Exception {
		movie1 = new Movie("Avatar","James Cameron", "10");
		movie2= new Movie("Everything Must Go", "Dan Hush","0");
	}

	@Test
	public void shouldReturnNameOfMovie(){
		assertEquals("Avatar", movie1.getName());
		
	}
	
	@Test
	public void shouldReturnDirectorOfMovie(){
		assertEquals("James Cameron", movie1.getDirector());
		
	}
	
	@Test
	public void shouldReturnRatingOfMovie()
	{
		assertEquals("10", movie1.getRating());
		assertEquals("N/A", movie2.getRating());


	}
	
	

}
