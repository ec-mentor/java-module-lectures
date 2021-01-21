package academy.everyonecodes.java.week2.livecoding.set2.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StepCollector collector = new StepCollector();
        List<Integer> steps = collector.collect();
        AverageCalculator calculator = new AverageCalculator();
        double averageSteps = calculator.calculateAverage(steps);
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double averageKilometers = distanceCalculator.calculateDistanceInKilometers(averageSteps);

        System.out.println("They took an average of " + averageSteps + " steps and walked an average of " + averageKilometers + "km.");
    }
}
