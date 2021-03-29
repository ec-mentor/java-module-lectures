package academy.everyonecodes.java.evaluationweek2.exerciseboard.exercise6;

import java.util.Optional;

public class AppParser {
    public Optional<App> parseLine(String line) {
        var splitLine = line.split(",");
        try {
            var name = splitLine[0];
            var category = splitLine[1];
            return Optional.of(new App(name, category));
        } catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }
}
