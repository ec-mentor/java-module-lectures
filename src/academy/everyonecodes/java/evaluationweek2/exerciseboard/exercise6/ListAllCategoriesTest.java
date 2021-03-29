package academy.everyonecodes.java.evaluationweek2.exerciseboard.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

class ListAllCategoriesTest {

    private ListAllCategories listAllCategories = new ListAllCategories();

    @ParameterizedTest
    @MethodSource("inputData")
    void findCategories(List<App> input, Set<String> expected) {
        var result = listAllCategories.findCategories(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> inputData() {
        return Stream.of(
                Arguments.of(List.of(
                        new App("Coloring book moana", "ART_AND_DESIGN"),
                        new App("Photo Editor & Candy Camera & Grid & ScrapBook", "ART_AND_DESIGN")
                ), Set.of("ART_AND_DESIGN")),
                Arguments.of(List.of(
                        new App("Coloring book moana", "ART_AND_DESIGN"),
                        new App("Used Cars Mexico", "AUTO_AND_VEHICLES")
                ), Set.of("ART_AND_DESIGN", "AUTO_AND_VEHICLES")));
    }

}