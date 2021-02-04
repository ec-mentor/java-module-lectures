package academy.everyonecodes.java.week4.livecoding.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {
    public double calculate(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        var mutableList = new ArrayList<>(list);
        Collections.sort(mutableList);
        int middleIndex = mutableList.size() / 2;
        if (mutableList.size() % 2 == 0) {
            double first = mutableList.get(middleIndex - 1);
            double second = mutableList.get(middleIndex);
            return (first + second) / 2;
        } else {
            return mutableList.get(middleIndex);
        }
    }
}
