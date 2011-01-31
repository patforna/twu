package com.thoughtworks.biblioteca.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.biblioteca.domain.Book;
import com.thoughtworks.constants.Constants;

public class BooksRepository {
	
	BufferedReader reader = null;
	List<Book> books = new ArrayList<Book>();
	
	public List<Book> showAllBooks()
	{
		try {

			reader = new BufferedReader(new FileReader(Constants.BOOKLIST));
			String line = null;
			while((line= reader.readLine())!=null)
			{
				String bookName = line.substring(0,line.indexOf("by")-1);
				String author = line.substring(line.indexOf("by")+3);
				books.add(new Book(bookName, author));
				
			}
	}
		catch(FileNotFoundException ex) {
			System.out.println("Bad filename."
					+ "Check the name of the file and try again") ;
	} catch (IOException e) {
			e.printStackTrace();
		}
	return books;
	}


}
