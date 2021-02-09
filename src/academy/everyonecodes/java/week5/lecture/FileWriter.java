package academy.everyonecodes.java.week5.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriter {
    public void write(String contentRootPath, List<String> lines) {
        Path path = Path.of(contentRootPath);
//        Files.write(path, lines); // "Add exception to method signature"
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
