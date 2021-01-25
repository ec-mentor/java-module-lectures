package academy.everyonecodes.java.week3.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MinFinderTest {
    private MinFinder minFinder = new MinFinder();

    @Test
    void min_shouldFindMinimumListInOrder() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        int expected = 1;
        int result = minFinder.min(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void min_shouldFindMinimumListInReverseOrder() {
        List<Integer> input = List.of(5, 4, 3, 2, 1);
        int expected = 1;
        int result = minFinder.min(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void min_shouldFindMinimumListWithNegativeNumbers() {
        List<Integer> input = List.of(3, 4, -5, 2, 1);
        int expected = -5;
        int result = minFinder.min(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void min_shouldFindMinimumListWithZeroesAndOneNumber() {
        List<Integer> input = List.of(0, 0, 5, 0, 0);
        int expected = 0;
        int result = minFinder.min(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void min_shouldFindMinimumListWithASingleElement() {
        List<Integer> input = List.of(1);
        int expected = 1;
        int result = minFinder.min(input);
        Assertions.assertEquals(expected, result);
    }
}
