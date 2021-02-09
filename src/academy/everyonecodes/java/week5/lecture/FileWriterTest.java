package academy.everyonecodes.java.week5.lecture;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileWriterTest {

    private String testFilePath = "src/academy/everyonecodes/java/week5/lecture/files/test-writer.txt";

    @Test
    void write() throws IOException {
        List<String> input = List.of("example1", "example2");
        FileWriter writer = new FileWriter();
        writer.write(testFilePath, input);
        List<String> result = Files.readAllLines(Path.of(testFilePath));
        Assertions.assertEquals(input, result);
    }

    @AfterEach
    void afterEach() {
        try {
            Files.delete(Path.of(testFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}