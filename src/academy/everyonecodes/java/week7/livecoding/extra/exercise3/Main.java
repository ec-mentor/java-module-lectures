package academy.everyonecodes.java.week7.livecoding.extra.exercise3;

import com.google.gson.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonString = "\"[{\"\"name\"\": \"\"Action\"\", \"\"id\"\": 28}, {\"\"id\"\": 12, \"\"name\"\": \"\"Adventure\"\"}, {\"\"id\"\": 14, \"\"name\"\": \"\"Fantasy\"\"}, {\"\"id\"\": 878, \"\"name\"\": \"\"Science Fiction\"\"}]\"";
        jsonString = jsonString.substring(1, jsonString.length() - 1);
        jsonString = jsonString.replaceAll("\"\"", "\"");
        System.out.println(jsonString);
        var genres = Arrays.asList(gson.fromJson(jsonString, Genre[].class));
        System.out.println(genres);

    }
}
