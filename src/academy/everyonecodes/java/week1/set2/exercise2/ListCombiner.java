package academy.everyonecodes.java.week1.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ListCombiner {

    public static List<String> combine(List<String> firstList, List<String> secondList) {
        List<String> firstWordList = new ArrayList<>(firstList);
        List<String> secondWordList = new ArrayList<>(secondList);
        List<String> returnValue = new ArrayList<>();
        int i = 0;
        while (i < firstWordList.size() || i < secondWordList.size()) {
            if (i < firstWordList.size()) {
                String element = firstWordList.get(i);
                returnValue.add(element);
            }
            if (i < secondWordList.size()) {
                String element = secondWordList.get(i);
                returnValue.add(element);
            }
            i++;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        List<String> firstWordList = List.of("one", "three", "five");
        List<String> secondWordList = List.of("two", "four");
        List<String> resultWordList = combine(firstWordList, secondWordList);
        for (String word: resultWordList) {
            System.out.println(word);
        }
        System.out.println(firstWordList);
    }

}
