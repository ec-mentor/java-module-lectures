package academy.everyonecodes.java.week5.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderTest {

    FileReader fileReader = new FileReader();

    // Content root path
    String path = "src/academy/everyonecodes/java/week5/set2/files/document.txt";

    @Test
    void read() {
        List<String> result = fileReader.read(path);

        List<String> expected = List.of(
                "line 1;part 1-2",
                "line 2;part 2-2",
                "line 3;part 3-2");
        Assertions.assertEquals(expected, result);
    }
}
