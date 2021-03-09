package academy.everyonecodes.java.week7.livecoding.extra.exercise3;

import java.util.List;

public class MovieGenreCounter {

    public int countGenres(List<Movie> movies) {
        return (int) movies.stream()
                .map(Movie::getGenres)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
}
