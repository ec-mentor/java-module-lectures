package academy.everyonecodes.java.week4.lecture;

import java.util.List;

public class Typing {
    public static void main(String[] args) {
        var example = "example"; // Local variable type inference
        var otherExample = 123.0;
        var list = List.of(otherExample);
        System.out.println(example);
//        example = 123;
        int exampleInt = 123;
        example(1234);
        example("foo");


    }

    // Method overloading

    static void example(int input) {

    }

    static void example(String input) {

    }
}
