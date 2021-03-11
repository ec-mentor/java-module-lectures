package academy.everyonecodes.java.week8.livecoding.set2.exercise3.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MultiplicationTest {
    private Multiplication multiplication = new Multiplication();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 2",
            "0, 0, 0",
            "-1, -2, 2",
            "-1, 2, -2",
            "0, 2, 0",
            "0, -2, -0"
    })
    void operate(double number1, double number2, double expected) {
        var result = multiplication.operate(number1, number2);
        Assertions.assertEquals(expected, result, 0.000001);
    }
}