package academy.everyonecodes.java.week5.lecture;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) {
        List<String> list = List.of();

        Scanner scanner = new Scanner(System.in);
        try {
            int myInt = scanner.nextInt();
            System.out.println(myInt);
            String firstElement = list.get(0);
            System.out.println(firstElement);
        } catch (InputMismatchException e) {
//            System.out.println("Please enter a number.");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("List can't be empty!");
        }

    }
}
