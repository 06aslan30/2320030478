package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorterByRating {
    public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 9.3, 1994));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("12 Angry Men", 8.9, 1957));
        movies.add(new Movie("Schindler's List", 8.9, 1993));

        // Instantiate the RatingComparator
        RatingComparator ratingComparator = new RatingComparator();

        // Sort the movies by rating using the RatingComparator
        Collections.sort(movies, ratingComparator);

        // Print the sorted list of movies
        System.out.println("Movies sorted by Rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

