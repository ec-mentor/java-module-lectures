package academy.everyonecodes.java.week4.livecoding.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class DoubleListMedianCalculatorTest {

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Double> input, double expected) {
        var calculator = new DoubleListMedianCalculator();
        var result = calculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> calculate() {
        return Stream.of(
                Arguments.of(
                        List.of(1.0, 2.0, 3.0, 4.0, 5.0), 3.0
                ),
                Arguments.of(
                        List.of(5.0, 4.0, 3.0, 2.0, 1.0), 3.0
                ),
                Arguments.of(
                        List.of(5.0, 3.0, 4.0, 1.0, 2.0), 3.0
                ),
                Arguments.of(
                        List.of(-5.0, 3.0, 4.0, -1.0, 2.0), 2.0
                ),
                Arguments.of(
                        List.of(-5.2, 3.6, 4.1, -1.3), 1.15
                ),
                Arguments.of(
                        List.of(1.0, 2.0, 3.0, 4.0), 2.5
                ),
                Arguments.of(
                        List.of(1.0), 1.0
                ),
                Arguments.of(
                        List.of(), 0.0
                ),
                Arguments.of(
                        null, 0.0
                )
        );
    }
}
