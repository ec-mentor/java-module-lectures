package academy.everyonecodes.java.practice.lecture.dataclasses;

public class Main {
    public static void main(String[] args) {
        String example = "Hello, world";
        if (example.length() < 10) {
            example = example.toLowerCase();
        } else {
            example = example.toUpperCase();
        }
        System.out.println(reverse(example));
    }

    private static String reverse(String string) {
        String returnValue = "";
        for (int i = string.length() - 1; i > 0; i--) {
            returnValue += string.charAt(i);
        }
        return returnValue;
    }
}
