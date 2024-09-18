package com;

public class Movie {
	  private String name;
	    private double rating;
	    private int year;

	    // Constructor
	    public Movie(String name, double rating, int year) {
	        this.name = name;
	        this.rating = rating;
	        this.year = year;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public double getRating() {
	        return rating;
	    }

	    public int getYear() {
	        return year;
	    }

	    @Override
	    public String toString() {
	        return "Movie{" +
	                "name='" + name + '\'' +
	                ", rating=" + rating +
	                ", year=" + year +
	                '}';
	    }
}
