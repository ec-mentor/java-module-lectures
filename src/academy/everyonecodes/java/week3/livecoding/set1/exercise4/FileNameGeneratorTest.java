package academy.everyonecodes.java.week3.livecoding.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FileNameGeneratorTest {
    private FileNameGenerator generator = new FileNameGenerator();

    @ParameterizedTest
    @CsvSource({
            "example.jpg, example.png",
            "123.jpg, 123.png",
            "asdf.jpeg, asdf.jpeg",
            "'', ''",
    })
    void generateNewName(String input, String expected) {
        String result = generator.generateNewName(input);
        Assertions.assertEquals(expected, result);
    }
}
