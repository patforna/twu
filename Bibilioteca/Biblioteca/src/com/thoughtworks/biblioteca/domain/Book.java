package com.thoughtworks.biblioteca.domain;

import com.thoughtworks.constants.Constants;

public class Book {

	private final String bookName;

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public boolean canBookBeCheckedOut(int bookNumberEntered)
	{
		if (bookNumberEntered > 0 && bookNumberEntered <= Constants.TOTALBOOKS) 
			return true;
		
		return false;
	}
	private final String author;

}
