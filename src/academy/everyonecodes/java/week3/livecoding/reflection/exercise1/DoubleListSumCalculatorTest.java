package academy.everyonecodes.java.week3.livecoding.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListSumCalculatorTest {
    private DoubleListSumCalculator calculator = new DoubleListSumCalculator();

    @ParameterizedTest
    @MethodSource("inputData")
    void calculate(List<Double> input, double expected) {
        double result = calculator.calculate(input);
        Assertions.assertEquals(expected, result, 0.00001);
    }

    private static Stream<Arguments> inputData() {
        return Stream.of(
                Arguments.of(
                        List.of(1.0, 2.0, 3.0, 4.0, 5.0), 15.0
                ),
                Arguments.of(
                        List.of(), 0.0
                ),
                Arguments.of(
                        List.of(-1.0, -2.0, -3.0, 3.0, 2.0, 1.0), 0.0
                ),
                Arguments.of(
                        List.of(-1.0, -2.0, -3.0, -4.0, -5.0), -15.0
                ),
                Arguments.of(
                        List.of(1.5, 2.5, 3.5), 7.5
                )
        );
    }


}