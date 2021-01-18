package academy.everyonecodes.java.week1.reflection.exercise1;

public class PowerCalculator {

    public static int raiseToPower(int one, int two) {
        int numberToReturn = 1;
        for (int i = 0; i < two; i++){
            numberToReturn *= one;
        }
        return numberToReturn;
    }

    public static void main(String[] args) {
        System.out.println(raiseToPower(1, 0) == 1);
        System.out.println(raiseToPower(0, 0) == 1);
        System.out.println(raiseToPower(-3, 2) == 9);
        System.out.println(raiseToPower(-3, 3) == -27);
        System.out.println(raiseToPower(0, 10) == 0);
        System.out.println(raiseToPower(3, 3) == 27);
        System.out.println(raiseToPower(4, 1) == 4);
        System.out.println(raiseToPower(-4, 1) == -4);
    }

}
