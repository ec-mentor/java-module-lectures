package academy.everyonecodes.java.week5.reflection.extra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
    public List<String> read(String fileLocation) throws IOException {
        return Files.readAllLines(Path.of(fileLocation));
    }
}
