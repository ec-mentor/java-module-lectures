package academy.everyonecodes.java.week5.reflection.extra;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Exception propagation
        MyFileReader reader = new MyFileReader();
        try {
            var lines = reader.read("");
            if (lines.isEmpty()) {
                System.out.println("File is empty");
            } else {
                System.out.println(lines);
            }
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }
}
