package academy.everyonecodes.java.week2.livecoding.set2.exercise4;

import java.util.List;

public class AverageCalculator {

    /**
     * @param numbers Should be non-empty and only contain positive numbers. Behaviour is undefined otherwise.
     * @return
     */
    public double calculateAverage(List<Integer> numbers) {
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}
