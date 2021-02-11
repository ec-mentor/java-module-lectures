package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestNameFinderTest {
    private LongestNameFinder finder = new LongestNameFinder();

    @ParameterizedTest
    @MethodSource("inputData")
    void find(List<Character> input, Character expected) {
        Optional<Character> result = finder.find(input);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected, result.get());
    }

    static Stream<Arguments> inputData() {
        return Stream.of(
                Arguments.of(
                        List.of(new Character("asdf", "", "")),
                        new Character("asdf", "", "")
                ),
                Arguments.of(
                        List.of(
                                new Character("asdf", "", ""),
                                new Character("asdf aksjdasd", "", ""),
                                new Character("as", "", "")
                                ),
                        new Character("asdf aksjdasd", "", "")
                ),
                Arguments.of(
                        List.of(
                                new Character("hello", "", ""),
                                new Character("olleh", "", "")
                        ),
                        new Character("hello", "", "")
                ),
                Arguments.of(
                        List.of(
                                new Character("", "", "")
                        ),
                        new Character("", "", "")
                )
        );
    }

    @Test
    void find_ListIsEmpty() {
        Optional<Character> result = finder.find(List.of());
        Assertions.assertTrue(result.isEmpty());
    }

}