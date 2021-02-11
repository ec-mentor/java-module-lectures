package academy.everyonecodes.java.week5.set2.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileWriterTest {

    FileWriter fileWriter = new FileWriter();
    FileReader fileReader = new FileReader();

    // Content root path
    String path = "src/academy/everyonecodes/java/week5/set2/exercise1/write.txt";

    @Test
    void write() {
        List<String> input = List.of("This is the line 1");

        fileWriter.write(path, input);

        List<String> result = fileReader.read(path);
        Assertions.assertEquals(input, result);
    }

    @Test
    void append() {
        List<String> first = List.of("This is the line 1");
        List<String> second = List.of("This is the line 2");

        fileWriter.append(path, first);
        fileWriter.append(path, second);
        List<String> result = fileReader.read(path);

        List<String> expected = List.of("This is the line 1", "This is the line 2");
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void after() {
        try {
            Files.delete(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
