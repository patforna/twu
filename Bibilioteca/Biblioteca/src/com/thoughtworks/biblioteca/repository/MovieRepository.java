package com.thoughtworks.biblioteca.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.constants.Constants;
import com.thoughtworks.biblioteca.domain.Movie;


public class MovieRepository {
	BufferedReader reader = null;
	List<Movie> movies = new ArrayList<Movie>();

	public List<Movie> showAllMovies() {
		try {
			reader = new BufferedReader(new FileReader(Constants.MOVIELIST));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String movieName = line.substring(0, line.indexOf("-"));
				String director = line.substring(line.indexOf("-") + 1,
						line.indexOf(":"));
				String rating = line.substring(line.indexOf(":") + 1);
				movies.add(new Movie(movieName, director, rating));

			}
		} catch (FileNotFoundException ex) {
			System.out.println("Bad filename."
					+ "Check the name of the file and try again");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return movies;
	}
}
