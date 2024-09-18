package com;

public class Movie implements Comparable<Movie> {
    private double rating;
    private final String name;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // Implementing the compareTo method to sort movies by year of release
    @Override
    public int compareTo(Movie other) {
        return this.year - other.year; // Ascending order
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