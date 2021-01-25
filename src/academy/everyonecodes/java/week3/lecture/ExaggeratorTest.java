package academy.everyonecodes.java.week3.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExaggeratorTest {

    private Exaggerator exaggerator = new Exaggerator();

    @Test
    void exaggerate_addsAnExclamationMark() {
        exaggerate_checkEquals("Today is great", "Today is great!");
    }

    @Test // Annotation
    void exaggerate_addsAnExclamationMarkToAnEmptyString() {
        exaggerate_checkEquals("", "!");
    }

    private void exaggerate_checkEquals(String input, String expected) {
        String result = exaggerator.exaggerate(input);
        Assertions.assertEquals(expected, result);
    }
}
