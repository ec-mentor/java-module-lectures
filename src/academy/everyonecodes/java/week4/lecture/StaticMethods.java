package academy.everyonecodes.java.week4.lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        var names = new ArrayList<>(List.of("John", "Alice", "Joe", "Bob"));
        Collections.sort(names);
        System.out.println(names);

        System.out.println(Math.abs(-10));
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
        System.out.println(Math.ceil(1.2));

        String value = "123";
        int intValue = Integer.valueOf(value);
        System.out.println(intValue + 5);

        String myDouble = "123.5";
        double doubleValue = Double.valueOf(myDouble);
        System.out.println(doubleValue + 5);

        String doubleString = String.valueOf(doubleValue);
        System.out.println(doubleString);
    }
}
