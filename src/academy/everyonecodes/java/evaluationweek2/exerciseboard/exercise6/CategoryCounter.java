package academy.everyonecodes.java.evaluationweek2.exerciseboard.exercise6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryCounter {
    public Map<String, Integer> countCategories(List<App> apps) {
        var longMap = apps.stream()
                .collect(Collectors.groupingBy(App::getCategory, Collectors.counting()));
        var result = longMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, (entry) -> entry.getValue().intValue()));
        return result;
    }
}
