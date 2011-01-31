package com.thoughtworks.biblioteca.view;

import java.util.List;

import com.thoughtworks.biblioteca.domain.Book;
import com.thoughtworks.biblioteca.domain.Movie;
import com.thoughtworks.biblioteca.domain.User;
import com.thoughtworks.biblioteca.repository.BooksRepository;
import com.thoughtworks.biblioteca.repository.MovieRepository;

public class View {

	public void displayMovieCatalog() {
		System.out.println("Movie" + "     " + "Director" + "        "
				+ "Rating");
		System.out
				.println("------------------------------------------------------");
		List<Movie> availableMovies = new MovieRepository().showAllMovies();
		int count = 1;
		for (Movie movie : availableMovies){
			System.out.println(count + "   " + movie.getName() + "  "
					+ movie.getDirector() + "  " + movie.getRating());
		count++;
		}
		

	}

	public void displayBooks() {
		List<Book> availableBooks = new BooksRepository().showAllBooks();
		int count = 1;
		for (Book book : availableBooks){
		System.out.println(count + " " + book.getBookName() + "  " + "by" + book.getAuthor());
		count++;
		}
	}

	public void displayLibrayNumber() {
		String libNo = new User().getLibraryNumberOfUser();
		if (libNo.equals("")) {
			System.out.println("\n");
			System.out.println("Please talk to Librarian. Thank you.");
		} else {
			System.out.println("Your Library Number is " + libNo);
		}
	}

	public void checkoutBooks() {

		System.out.println(" Please enter the number of the book you wish to checkout: ");
		int booksToCheckOut = 0;	
		booksToCheckOut = Integer.parseInt(new Console().readInput());
		boolean canBeCekedOut = new Book("","").canBookBeCheckedOut(booksToCheckOut);
		if(canBeCekedOut)
		{
			System.out.println("\n");
			System.out.println(" Thank You! Enjoy the book.");
		} else {
			System.out.println("Enter a valid selection");
		}
	}

}