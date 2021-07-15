package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieCollection {
    private List<Movie> movies;
    
    public MovieCollection() {
        movies = new ArrayList<>();
    }
    
    public void add(Movie movie) {
        movies.add(movie);
    }
    
    public List<Movie> filterMovies(Predicate<Movie> condition) {
        return movies.stream()
            .filter(m -> condition.test(m))
            .collect(Collectors.toList());
    }
    
    public double getLowestRating() {
        if (movies.isEmpty()) {
            return 0.0;
        } else {
            return movies.stream()
                .map(m -> m.getRating())
                .reduce(5.0, (a, b) -> Math.min(a, b)); // set highest possible rating as default
        }
    }
    
    public double getHighestRating() {
        if (movies.isEmpty()) {
            return 0.0;
        } else {
            return movies.stream()
                .map(m -> m.getRating())
                .reduce(1.0, (a, b) -> Math.max(a, b)); // set lowest possible rating as default
        }
    }
    
    public double getAverageRating() {
        double sum = movies.stream()
            .map(m -> m.getRating())
            .reduce(0.0, (a, b) -> a + b);

        if (sum == 0.0) {
            return sum;
        } else {
            return sum / movies.size();
        }
    }
    
    public int getSize() {
        return movies.size();
    }
}