package academy.everyonecodes.java.week5.lecture;

import javax.swing.text.html.Option;
import java.util.*;

public class OptionalsMain {
    public static void main(String[] args) {
        List<String> exampleList = List.of("Hello", "World");
        System.out.println(exampleList.get(0));
//        List<String> exampleEmptyList = List.of();
//        System.out.println(exampleEmptyList.get(0));


// The final keyword will make it so that a variable can't be re-assigned.
// But, the variable can still be mutated (if it is mutable).

//        final List<String> mutableList = new ArrayList<>();
//        mutableList.add("example");
//        mutableList = new ArrayList<>();
//
//
//        final Optional<String> exampleOptional = Optional.of("Hello");
//        exampleOptional = Optional.empty();
//        System.out.println(exampleOptional.get());



        Optional<String> exampleEmptyOptional = Optional.empty();

        if (exampleEmptyOptional.isPresent()) {
            System.out.println(exampleEmptyOptional.get());
        }

        if (!exampleEmptyOptional.isEmpty()) {
            System.out.println(exampleEmptyOptional.get());
        }

        Optional<String> address = Optional.of("Theodor-Sickel-Gasse 123");
//        Optional<String> address = Optional.empty();

        if (address.isPresent()) {
            System.out.println(address.get());
        } else {
            System.out.println("Address not specified.");
        }

        System.out.println(address.orElse("Address not specified."));

        Optional<Integer> intOptional = Optional.of(123);
        System.out.println(intOptional.orElse(456));

        // Conditional operator
        // Ternary operator
//        String example = address.isEmpty() ? address.get() : "Address not specified.";



        List<Integer> integers = List.of(1, 2, 3, 5);
        MinFinder minFinder = new MinFinder();
        Optional<Integer> smallestElement = minFinder.min(integers);

        if (smallestElement.isPresent()) {
            System.out.println(smallestElement.get());
        } else {
            System.out.println("List is empty");
        }

        Optional<String> returnValue = minFinder.exampleString(List.of());
        if (returnValue.isPresent()) {
            System.out.println(returnValue.get().toUpperCase());
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                int scannedInt = scanner.nextInt();
                System.out.println("You entered: " + scannedInt);
            } catch (Exception e) {
                System.out.println("This is not a number!");
            }
        }

    }
}
