package academy.everyonecodes.java.week8.livecoding.set2.exercise3.operators;

import java.util.List;

public class Operators {

    private static final List<Operator> list = List.of(new Sum(), new Subtraction(), new Multiplication(), new Division());

    public static List<Operator> get() {
        return list;
    }
}
