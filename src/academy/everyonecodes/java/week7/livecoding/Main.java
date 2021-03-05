package academy.everyonecodes.java.week7.livecoding;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        example();

        Runnable exampleMethod = Main::example;
        exampleMethod.run();

        Runnable lambda = () -> {
            System.out.println("I'm inside a lambda!");
        };
        lambda.run();

        System.out.println(convertToLowerCase("UPPERCASESTRING"));

        Function<String, String> convertToLowerCaseMethod = Main::convertToLowerCase;
        System.out.println(convertToLowerCaseMethod.apply("UPPERCASESTRING"));

        Function<String, String> converToLowerCaseLambda = (string) -> {
            return string.toLowerCase();
        };
        System.out.println(converToLowerCaseLambda.apply("UPPERCASESTRING"));

        callAFunction(lambda);
        callAFunction(Main::example);

        var names = List.of("John", "Jack", "Joe", "Gill");
        var filteredNames = names.stream()
                .filter((name) -> {
                    if (name.startsWith("J")) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        var filteredListCustom = filterList(names, (name) -> {
            if (name.startsWith("J")) {
                return true;
            }
            return false;
        });
        System.out.println(filteredListCustom);

    }

    public static List<String> filterList(List<String> inputList, Function<String, Boolean> filterFunction) {
        List<String> result = new ArrayList<>();
        for (String element: inputList) {
            if (filterFunction.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void example() {
        System.out.println("example");
    }

    public static String convertToLowerCase(String string) {
        return string.toLowerCase();
    }


    public static void callAFunction(Runnable inputFunction) {
        inputFunction.run();
    }
}
