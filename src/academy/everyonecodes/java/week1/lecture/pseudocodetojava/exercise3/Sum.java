package academy.everyonecodes.java.week1.lecture.pseudocodetojava.exercise3;

public class Sum {

    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {

//        3, 10 --> 13
//        0, 0 --> 0
//        -5, 5 --> 0
//        -5, -5 --> -10
//        3, 0 --> 3

        if (sum(3, 10) == 13) {
            System.out.println("Test succeded!");
        } else {
            System.out.println("Test failed!");
        }

        if (sum(0, 0) == 0) {
            System.out.println("Test succeded!");
        } else {
            System.out.println("Test failed!");
        }

        if (sum(-5, 5) == 0) {
            System.out.println("Test succeded!");
        } else {
            System.out.println("Test failed!");
        }

    }
}
