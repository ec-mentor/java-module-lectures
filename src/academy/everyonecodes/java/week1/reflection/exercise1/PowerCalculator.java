package academy.everyonecodes.java.week1.reflection.exercise1;

public class PowerCalculator {

    public static int raiseToPower(int basis, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int result = basis;
        for (int i = 1; i < exponent; i++) {
            result = result * basis;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = raiseToPower(2, 5);
        System.out.println(result);
    }

}
