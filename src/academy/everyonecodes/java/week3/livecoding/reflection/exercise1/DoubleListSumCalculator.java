package academy.everyonecodes.java.week3.livecoding.reflection.exercise1;

import java.util.List;

public class DoubleListSumCalculator {

    public double calculate(List<Double> list) {
        double sum = 0;
        for (double value : list) {
            sum += value;
        }
        return sum;
    }
}
