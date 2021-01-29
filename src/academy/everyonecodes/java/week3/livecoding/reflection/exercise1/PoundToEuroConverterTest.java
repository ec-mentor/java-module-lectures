package academy.everyonecodes.java.week3.livecoding.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PoundToEuroConverterTest {
    private PoundToEuroConverter converter = new PoundToEuroConverter();

    @ParameterizedTest
    @CsvSource({
            "1, 1.1764705882",
            "0, 0",
            "0.5, 0.5882352941",
            "2, 2.3529411765",
            "-3, -3.5294117647",
    })
    void convert(double input, double expected) {
        double result = converter.convert(input);
        Assertions.assertEquals(expected, result, 0.00001);
    }

}