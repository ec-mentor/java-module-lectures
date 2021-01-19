package academy.everyonecodes.java.week2.lecture2;

public class StringTransformer {
    public String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public String upperCase(String input) {
        return input.toUpperCase();
    }
}
