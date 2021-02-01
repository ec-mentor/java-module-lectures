package academy.everyonecodes.java.week4.lecture;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String example = "EXAMPLE";
        String exampleLowerCase = example.toLowerCase();
        System.out.println(example);
        System.out.println(exampleLowerCase);
        if (example.equals(exampleLowerCase)) {
            System.out.println("they are the same");
        }

        if (example.equalsIgnoreCase(exampleLowerCase)) {
            System.out.println("they are the same, ignoring case");
        }

        printLowerCase(null);
        printLowerCase("OTHER EXAMPLE");


        String exampleTrim = "     john@example.com   ";
        String trimmed = exampleTrim.trim();
        System.out.println(trimmed);
        System.out.println(exampleTrim.startsWith("john"));
        System.out.println(trimmed.startsWith("john"));
        System.out.println(trimmed.endsWith(".com"));
        System.out.println(exampleTrim.contains("example"));


        String exampleWithJohn = "John is a great friend. I enjoy going hiking with John. I've known John a long time.";
        String exampleWithLisa = exampleWithJohn.replaceAll("John", "Lisa");
        System.out.println(exampleWithLisa);

        String separatedString = "John,Joe,Jack,Lisa"; // Semi-structured data
        List<String> names = Arrays.asList(separatedString.split(","));
        System.out.println(names.get(0));

        List<String> maleNames = List.of("John", "Joe");
        List<String> femaleNames = List.of("Lisa", "Samantha");
        List<List<String>> listOfLists = List.of(maleNames, femaleNames);

        List<List<List<String>>> listOfListOfLists;


        Random random = new Random();

        int randomInteger = random.nextInt();
        int boundInt = random.nextInt(10);
        int anotherRandom = random.nextInt();

        int min = 1;
        int max = 6;
        int diceRoll = min + random.nextInt((max - min) + 1);

        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        System.out.println(randomInteger);
        System.out.println(boundInt);
        System.out.println(anotherRandom);
        System.out.println(diceRoll);
        System.out.println(randomDouble);
        System.out.println(randomBoolean);

    }

    static void printLowerCase(String inputValue) {
        if (inputValue == null) {
            return;
        }

        if ("".equals(inputValue)) {
            return;
        }

        System.out.println(inputValue.toLowerCase());
    }
}

