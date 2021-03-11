package academy.everyonecodes.java.week8.livecoding.set2.exercise3;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter the operation:");
        var input = scanner.nextLine();
        var splitInput = input.split(" ");
        try {
            var calculation = new Calculation(Double.parseDouble(splitInput[0]), Double.parseDouble(splitInput[2]), splitInput[1]);
            var oResult = calculator.calculate(calculation);
            oResult.ifPresentOrElse(
                    result -> System.out.println("Solution: " + result),
                    () -> System.out.println("Solution: operation not available"));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid operation");
        }
    }
}
