package academy.everyonecodes.java.week8.livecoding.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        var listOfLists = List.of(
                List.of(10, 23, 50, 23), // Test scores for student 1
                List.of(12, 26, 53, 20), // Test scores for student 2
                List.of(0, 12, 53, 3) // Test scores for student 3
        );
        var result = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
//                .max(Integer::compareTo);
        System.out.println(result);

        List<Optional<Integer>> listOfOptionals = List.of(
                Optional.of(23),
                Optional.of(23),
                Optional.of(1),
                Optional.empty(),
                Optional.of(23),
                Optional.of(23),
                Optional.empty(),
                Optional.of(12),
                Optional.empty(),
                Optional.of(23),
                Optional.of(30),
                Optional.of(9)
        );
        var unwrappedOptionals = listOfOptionals.stream()
//                .filter(Optional::isPresent)
//                .map(Optional::get)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());


        var listOfNumbers = List.of(1, 2, 3, 4, 5);
        var sum = listOfNumbers.stream()
                .reduce(0, (subtotal, element) -> {
                    return subtotal + element;
                });
        System.out.println(sum);

        var listOfStrings = List.of("John", "Jack", "Joe", "Gill", "Lisa");
        var concatenatedStrings = listOfStrings.stream()
                .reduce("All names: ", (subConcatenated, element) -> {
                    return subConcatenated + ", " + element;
                });
        System.out.println(concatenatedStrings);
    }
}
