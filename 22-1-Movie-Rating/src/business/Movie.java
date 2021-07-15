package business;

import java.text.NumberFormat;

public class Movie {
    private String title;
    private int year;
    private double rating;

    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public boolean isEmpty() {
        return title.isEmpty() && year == 0 && rating == 0.0;
    }
    
    @Override
    public String toString() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        return title + " (" + year + ") Rating: " + number.format(rating);
    }
}