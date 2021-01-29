package academy.everyonecodes.java.week3.livecoding.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueCalculatorTest {
    private AbsoluteValueCalculator calculator = new AbsoluteValueCalculator();

    @ParameterizedTest
    @CsvSource({
            "-3, 3",
            "-5.5, 5.5",
            "0, 0",
            "3, 3",
            "5.5, 5.5",
    })
    void calculate(double input, double expected) {
        double result = calculator.calculate(input);
        Assertions.assertEquals(expected, result, 0.00001);
    }
}