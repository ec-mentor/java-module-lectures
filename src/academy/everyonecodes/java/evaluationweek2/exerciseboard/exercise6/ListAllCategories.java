package academy.everyonecodes.java.evaluationweek2.exerciseboard.exercise6;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListAllCategories {

    public Set<String> findCategories(List<App> apps) {
        var result = apps.stream()
                .map(App::getCategory)
                .collect(Collectors.toSet());
        return result;
    }
}
