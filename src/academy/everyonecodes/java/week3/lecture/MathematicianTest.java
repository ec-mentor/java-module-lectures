package academy.everyonecodes.java.week3.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathematicianTest {
    Mathematician mathematician = new Mathematician();

//    @Test
//    void min_aLessB() {
//        min_assertEquals(1, 5, 1);
//    }
//
//    @Test
//    void min_bLessA() {
//        min_assertEquals(5, 2, 2);
//    }
//
//    @Test
//    void min_aEqualB() {
//        min_assertEquals(3, 3, 3);
//    }
//
//    @Test
//    void min_negativeNumber() {
//        min_assertEquals(5, -10, -10);
//    }

    @ParameterizedTest
    @CsvSource({
            "1, 5, 1",
            "5, 2, 2",
            "3, 3, 3",
            "5, -10, -10",
    })
    void min_assertEquals(int a, int b, int expected) {
        int result = mathematician.min(a, b);
        Assertions.assertEquals(expected, result);
    }

}
