package academy.everyonecodes.java.week7.livecoding.extra.exercise3;

import com.google.gson.*;

import java.util.Arrays;
import java.util.Optional;

public class MovieParser {
    public Optional<Movie> parseMovie(String line) {
        var splitLine = line.split(";");
        if (splitLine.length != 11) {
            return Optional.empty();
        }

        try {
            Gson gson = new Gson();
            String jsonString = splitLine[1];
            if (!jsonString.startsWith("\"") || !jsonString.endsWith("\"")) {
                return Optional.empty();
            }
            jsonString = jsonString.substring(1, jsonString.length() - 1);
            jsonString = jsonString.replaceAll("\"\"", "\"");
            var parsedGenre = gson.fromJson(jsonString, Genre[].class);
            var genres = Arrays.asList(parsedGenre);

            return Optional.of(new Movie(Integer.parseInt(splitLine[2]), splitLine[8], Double.parseDouble(splitLine[5]), Double.parseDouble(splitLine[6]), genres, Double.parseDouble(splitLine[0])));
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }
}
