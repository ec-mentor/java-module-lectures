package academy.everyonecodes.java.week1.lecture.pseudocodetojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // print("Hello, World!")
        System.out.println("Hello, World!");

        // String example = "Hello!"
        // print(example)
        String example = "Hello!";
        System.out.println(example);

        // Boolean isCodingFun = true
        // print(isCodingFun)
        boolean isCodingFun = true;
        System.out.println(isCodingFun);

        // Number integerNumber = 5
        // Number decimalNumber = 10.5
        int integerNumber = 12342394;
//        long longIntegerNumber = 123123123;
//        float decimalNumber = 10.592323f;
        double decimalDouble = 3.141238;


        // Primitive data types vs Classes
        Integer integerNumberAsClass = 293234; // Autoboxing
        Double doubleAsClass = 293234.0; // Autoboxing
        doSomethingWithInt(integerNumberAsClass); // Auto-Unboxing
        int result = add(4, 3);
        System.out.println(result);


        int numberOfStudents = 10;
        double dividedResult = (double)numberOfStudents/6; // Type casting
        System.out.println(dividedResult);


        createWindow(10, 5, 200, 100);


//        Scanner scanner = new Scanner(System.in);

        // String line = readInput()
//        String line = scanner.nextLine();
//        System.out.println (line);
//        int number = scanner.nextInt();
//        System.out.println(number);
//        double decimal = scanner.nextDouble();
//        System.out.println(decimal);
//        boolean bool = scanner.nextBoolean();
//        System.out.println(bool);


        int numberOne = 10;
        int numberTwo = 5;

        // is --> ==
        // is not --> !=
        // not --> !
        if (numberOne < numberTwo) {
            System.out.println("numberOne is smaller than numberTwo");
        } else if (numberTwo > 2000) {
            System.out.println("numberOne is greater than or equal to numberTwo");
        } else {
            System.out.println("Neither of these");
        }


        if (numberOne == numberTwo) {
            System.out.println("Two numbers are the same!");
        }

        boolean isSomethingCorrect = false;

        if (!isSomethingCorrect) {
            System.out.println("always true!");
        }

        String john = new String("John Smith");
        String identicalJohn = john;
        String otherJohn = new String("John" + " Smith");

        System.out.println(john);
        System.out.println(otherJohn);
        // Equality vs Identity
        if (john == identicalJohn) {
            System.out.println("They're identical!");
        }
        if (john == otherJohn) {
            System.out.println("They're identical!");
        }
        if (john.equals(otherJohn)) {
            System.out.println("They're equal, but not necessarily identical!");
        }

        double decimalOne = 1.000001;
        double decimalTwo = 0.000001;
        double firstValueToCompare = decimalOne - decimalTwo;
        double secondValueToCompare = 1.0;
        if (Math.abs(firstValueToCompare - secondValueToCompare) < 0.000000001) {
            System.out.println("equal");
        }


        // List of String names = ["John", "Joe", "Jack"]
        List<String> names = List.of("John", "Joe", "Jack"); // Create an immutable list
        System.out.println(names.get(0));

        List<String> mutableNames = new ArrayList<>(); // Create a mutable List
        mutableNames.add("John");
        mutableNames.add("Joe");
        mutableNames.add("Jack");

        List<Integer> numbers = List.of(123, 234, 5656); // Create an immutable list
        System.out.println(numbers.get(0));
//        addOneToList(numbers); // This will crash, because the list is immutable

        List<Integer> otherNumbers = new ArrayList<>(); // Creating a mutable list
        addOneToList(otherNumbers);
        otherNumbers.add(2);
        otherNumbers.add(3);
        System.out.println(otherNumbers.get(0));

//        String[] namesArray = {"John", "Jack", "Joe"};
//        System.out.println(namesArray[0]);

        // for each name in names
        for (String name: names) {
            System.out.println(name);
        }

        for (int number: numbers) {
            System.out.println(number);
        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i = i + 1;
////            i += 1;
////            i++;
////            ++i;
//        }
//
//        i = 0;
//        do {
//            System.out.println(i);
//            i += 1;
//        } while (i < 10);


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }


    }

    public static void addOneToList(List<Integer> list) {
        list.add(1);
    }

    // function doSomethingWithInt(Number firstParam)
    public static void doSomethingWithInt(int firstParam) {
        System.out.println(firstParam);
    }

    // function add(Number numberOne, Number numberTwo) returns Number
    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void createWindow(int positionX, int positionY, int width, int height) {
        // Do stuff
    }

}
