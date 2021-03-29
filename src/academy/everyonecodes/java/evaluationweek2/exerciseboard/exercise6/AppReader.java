package academy.everyonecodes.java.evaluationweek2.exerciseboard.exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AppReader {

    private AppParser parser = new AppParser();

    public List<App> read() throws IOException {
        var filePath = Path.of("src/academy/everyonecodes/java/evaluationweek2/exerciseboard/exercise6/files/googleplaystore.csv");
        return Files.lines(filePath)
                .skip(1)
                .map(line -> parser.parseLine(line))
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }
}
