package com;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        // We compare the ratings in descending order (higher ratings come first)
        return Double.compare(m2.getRating(), m1.getRating());
    }
}
