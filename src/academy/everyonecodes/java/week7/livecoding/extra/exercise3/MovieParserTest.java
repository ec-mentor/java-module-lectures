package academy.everyonecodes.java.week7.livecoding.extra.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class MovieParserTest {
    private MovieParser parser = new MovieParser();

    @Test
    void parse() {
        Optional<Movie> expected = Optional.of(new Movie(19995, "Avatar", 2787965087.0, 162, List.of(new Genre(28, "Action"), new Genre(12, "Adventure"), new Genre(14, "Fantasy"), new Genre(878, "Science Fiction")), 237000000.0));
        String serializedMovie = "237000000;\"[{\"\"id\"\": 28, \"\"name\"\": \"\"Action\"\"}, {\"\"id\"\": 12, \"\"name\"\": \"\"Adventure\"\"}, {\"\"id\"\": 14, \"\"name\"\": \"\"Fantasy\"\"}, {\"\"id\"\": 878, \"\"name\"\": \"\"Science Fiction\"\"}]\";19995;150.437577;2009-12-10;2787965087;162;Enter the World of Pandora.;Avatar;7.2;11800";
        Optional<Movie> result = parser.parseMovie(serializedMovie);
        Assertions.assertEquals(expected, result);
    }

    // More tests needed.
}