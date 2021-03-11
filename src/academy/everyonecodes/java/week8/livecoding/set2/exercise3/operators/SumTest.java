package academy.everyonecodes.java.week8.livecoding.set2.exercise3.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private Sum sum = new Sum();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "0, 0, 0",
            "-1, -2, -3",
            "-1, 2, 1",
            "0, 2, 2",
            "0, -2, -2"
    })
    void operate(double number1, double number2, double expected) {
        var result = sum.operate(number1, number2);
        Assertions.assertEquals(expected, result, 0.000001);
    }

}