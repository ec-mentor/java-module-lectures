package academy.everyonecodes.java.week8.livecoding.set2.exercise3.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisionTest {
    private Division division = new Division();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 0.5",
            "0, 0, NaN",
            "10, 0, Infinity",
            "-10, 0, -Infinity",
            "-1, -2, 0.5",
            "-1, 2, -0.5",
            "0, 2, 0",
            "0, -2, -0"
            // from official solution:
//            "NaN, 0, 0",
//            "1, 1, 1",
//            "2, 4, 2",
//            "-1, 1, -1",
//            "-1, -1, 1",
//            "1, -1, -1",
    })
    void operate(double number1, double number2, double expected) {
        var result = division.operate(number1, number2);
        Assertions.assertEquals(expected, result, 0.000001);
    }
}