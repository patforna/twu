package com.thoughtworks.biblioteca.domain;


public class Movie {
	
	private final String name;
	private final String director;
	private final String rating;
	
	public Movie(String name, String director, String rating)
	{
		this.name= name;
		this.director = director;
		this.rating= rating;
	}
	public String getName() {
		return name;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getRating() {
		if(rating.equals("0"))
		{
			return "N/A";
		}
		return rating;
	}
	
}
