package ui;


import java.util.List;

import business.Console;
import business.Movie;
import business.MovieCollection;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MovieRatingApp {
    
    public static void main(String[] args) {
        // display a welcome message
        Console.println("Welcome to the Movie Ratings application!\n");

        // create collection object to hold movies
        MovieCollection movies = new MovieCollection();
        
        // add some starting data to make testing easier
        movies.add(new Movie("Wonder Woman", 2017, 4.1));
        movies.add(new Movie("Clash of the Titans", 2010, 2.6));
        movies.add(new Movie("Citizen Kane", 1941, 4.9));

        // create constants for menu options
        final int ADD_NEW = 1;
        final int VIEW_TOP_RATED = 2;
        final int VIEW_MOST_RECENT = 3;
        final int VIEW_ALL = 4;
        final int VIEW_RATINGS = 5;
        final int QUIT = 6;
        
        // continue until user quits application
        int choice = 0;
        while (choice < QUIT) {
            // display menu and get user's selection
            Console.println("-----------------------");
            Console.println("What do you want to do?");
            Console.println("-----------------------");
            Console.println("1 - Enter a movie");
            Console.println("2 - View top rated movies");
            Console.println("3 - View most recent movies");
            Console.println("4 - View all movies");
            Console.println("5 - View ratings");
            Console.println("6 - Quit application");
            
            Console.println();
            choice = Console.getInt("Choose a menu option: ", 0, 7);
            Console.println();
            
            List<Movie> filteredMovies;
            
            // take action based on user's selection
            switch (choice) {
                case ADD_NEW: 
                    int numberOfMovies = Console.getInt("How many movies do you want to enter? ");
                    for (int i = 0; i < numberOfMovies; i++) {
                        Console.println();
                        Console.println("Movie #" + (i + 1));
                        Console.println("----------");
                        
                        String title = Console.getString("Enter title: ");
                        int year = Console.getInt("Enter year: ");
                        double rating = Console.getDouble("Enter rating between 1 and 5 (decimals OK): ");
                        Movie movie = new Movie(title, year, rating);                                           
                        movies.add(movie);
                    }
                    break;
                case VIEW_TOP_RATED:
                    Console.println("Movies rated 4.0 or higher");
                    Console.println("--------------------------");
                    filteredMovies = movies.filterMovies(m -> m.getRating() >= 4.0);
                    printMovies(filteredMovies);
                    break;
                case VIEW_MOST_RECENT:
                    int currentYear = new GregorianCalendar().get(Calendar.YEAR);
                    int startYear = currentYear - 10;
                    Console.println("Movies made between " + startYear + " and " + currentYear);
                    Console.println("---------------------------------");
                    filteredMovies = movies.filterMovies(m -> m.getYear() >= startYear);
                    printMovies(filteredMovies);
                    break;
                case VIEW_ALL:
                    Console.println("All movies");
                    Console.println("----------");
                    filteredMovies = movies.filterMovies(m -> !m.isEmpty());
                    printMovies(filteredMovies);
                    break;
                case VIEW_RATINGS:
                    NumberFormat number = NumberFormat.getNumberInstance();
                    Console.println("Movie rating data");
                    Console.println("-----------------");
                    Console.println("Number of movies: " + movies.getSize());
                    Console.println("Lowest rating:    " + number.format(movies.getLowestRating()));
                    Console.println("Highest rating:   " + number.format(movies.getHighestRating()));
                    Console.println("Average rating:   " + number.format(movies.getAverageRating()));
                    break;
                case QUIT:
                    Console.println("Goodbye!");
                    break;
            }
            Console.println();
        }
    }
    
    private static void printMovies(List<Movie> filteredMovies) {
        if (filteredMovies.isEmpty()) {
            Console.println("None on file.");
        } else {
            filteredMovies.stream().map(Movie::toString).forEach(Console::println);
        }
    }   
}