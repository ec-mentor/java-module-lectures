package academy.everyonecodes.java.week5.lecture;

import java.util.List;
import java.util.Optional;

public class MinFinder {
    public Optional<Integer> min(List<Integer> list) {
        Optional<Integer> result = Optional.empty();
        if (!list.isEmpty()) {
            int min = list.get(0);
            for (int element : list) {
                if (element < min) {
                    min = element;
                }
            }
            result = Optional.of(min);
        }
        return result;
    }

    public Optional<String> exampleString(List<String> list) {
        if (list.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of("Example");
    }
}
