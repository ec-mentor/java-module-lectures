package academy.everyonecodes.java.week7.livecoding.extra.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieReader {
    private MovieParser parser = new MovieParser();
    public List<Movie> read(Path path) throws IOException {
        return Files.lines(path)
                .skip(1)
                .map(parser::parseMovie)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }
}
