package com.thoughtworks.biblioteca.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.biblioteca.domain.Book;

public class TestBook {
	private Book book;
	
	@Before
	public void setUp() throws Exception {
		 book = new Book("How to Win Friends and Influence People","Dale Carnagie");
	}

	@Test
	public void shouldReturnNameOfAuthor(){
		assertEquals("Dale Carnagie", book.getAuthor());
		
	}
	
	@Test
	public void shouldReturnNameOfBook(){
		assertEquals("How to Win Friends and Influence People", book.getBookName());
		
	}
	
	@Test
	public void shouldVerifyIfBookCanBeCheckedOut()
	{
		assertTrue(book.canBookBeCheckedOut(2));
		assertFalse(book.canBookBeCheckedOut(7));

	}
	
	

}
