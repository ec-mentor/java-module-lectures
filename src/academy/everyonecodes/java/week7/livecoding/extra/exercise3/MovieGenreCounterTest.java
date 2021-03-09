package academy.everyonecodes.java.week7.livecoding.extra.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MovieGenreCounterTest {
    private MovieGenreCounter counter = new MovieGenreCounter();

    @Test
    void countGenres() {
        var movie = new Movie(19995, "Avatar", 2787965087.0, 162, List.of(new Genre(28, "Action"), new Genre(12, "Adventure"), new Genre(14, "Fantasy"), new Genre(878, "Science Fiction")), 237000000.0);
        var result = counter.countGenres(List.of(movie));
        var expected = 4;
        Assertions.assertEquals(expected, result);
    }

    // More tests needed.
}