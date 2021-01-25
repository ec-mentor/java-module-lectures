package academy.everyonecodes.java.week3.lecture;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinFinder {

    public int min(List<Integer> list) {
        int result = list.get(0);
        for (int number : list) {
            if (number < result) {
                result = number;
            }
        }

        return result;
    }

}
