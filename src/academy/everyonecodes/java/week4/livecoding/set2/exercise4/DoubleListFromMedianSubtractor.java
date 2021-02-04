package academy.everyonecodes.java.week4.livecoding.set2.exercise4;

import academy.everyonecodes.java.week4.livecoding.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {
    public List<Double> calculate(List<Double> list) {
        DoubleListMedianCalculator calculator = new DoubleListMedianCalculator();
        double median = calculator.calculate(list);
        var result = new ArrayList<Double>();
        for (double element : list) {
            result.add(element - median);
        }
        return result;
    }
}
