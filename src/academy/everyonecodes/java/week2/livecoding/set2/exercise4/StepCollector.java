package academy.everyonecodes.java.week2.livecoding.set2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepCollector {
    public List<Integer> collect() {
        List<String> names = List.of("Matilda", "Hansel", "Derek");
        Scanner scanner = new Scanner(System.in);
        List<Integer> steps = new ArrayList<>();

        for (String name : names) {
            System.out.println("How many steps did you take, " + name);
            int numberOfSteps = scanner.nextInt();
            steps.add(numberOfSteps);
        }
        return steps;
    }
}
