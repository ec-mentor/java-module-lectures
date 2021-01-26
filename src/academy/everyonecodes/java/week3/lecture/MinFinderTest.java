package academy.everyonecodes.java.week3.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class MinFinderTest {
    private MinFinder minFinder = new MinFinder();

//    @Test
//    void min_shouldFindMinimumListInOrder() {
//        List<Integer> input = List.of(1, 2, 3, 4, 5);
//        int expected = 1;
//        int result = minFinder.min(input);
//        Assertions.assertEquals(expected, result);
//    }
//
//    @Test
//    void min_shouldFindMinimumListInReverseOrder() {
//        List<Integer> input = List.of(5, 4, 3, 2, 1);
//        int expected = 1;
//        int result = minFinder.min(input);
//        Assertions.assertEquals(expected, result);
//    }
//
//    @Test
//    void min_shouldFindMinimumListWithNegativeNumbers() {
//        List<Integer> input = List.of(3, 4, -5, 2, 1);
//        int expected = -5;
//        int result = minFinder.min(input);
//        Assertions.assertEquals(expected, result);
//    }
//
//    @Test
//    void min_shouldFindMinimumListWithZeroesAndOneNumber() {
//        List<Integer> input = List.of(0, 0, 5, 0, 0);
//        int expected = 0;
//        int result = minFinder.min(input);
//        Assertions.assertEquals(expected, result);
//    }
//
//    @Test
//    void min_shouldFindMinimumListWithASingleElement() {
//        List<Integer> input = List.of(1);
//        int expected = 1;
//        int result = minFinder.min(input);
//        Assertions.assertEquals(expected, result);
//    }

    @ParameterizedTest
    @MethodSource("inputData")
    void min(List<Integer> input, int expected) {
        int result = minFinder.min(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> inputData() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 2, 3, 4, 5), 1
                ),
                Arguments.of(
                        List.of(5, 4, 3, 2, 1), 1
                )
        );
    }
}
