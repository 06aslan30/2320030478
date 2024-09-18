package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorter {
    public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 9.3, 1994));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("12 Angry Men", 8.9, 1957));
        movies.add(new Movie("Schindler's List", 8.9, 1993));

        // Sorting the list of movies by year of release
        Collections.sort(movies);

        // Printing the sorted list of movies
        System.out.println("Movies sorted by year of release:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

