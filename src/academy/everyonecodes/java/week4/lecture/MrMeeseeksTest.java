package academy.everyonecodes.java.week4.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MrMeeseeksTest {

    @Test
    void testNumberOfMeeseeks() {
        Assertions.assertEquals(0, MrMeeseeks.getNumberOfMeeseeks());
        MrMeeseeks meeseeks = new MrMeeseeks("Do the laundry");
        String result = meeseeks.doTask();
        String expected = "I will Do the laundry";
        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(1, MrMeeseeks.getNumberOfMeeseeks());

        MrMeeseeks meeseeks2 = new MrMeeseeks("Do the laundry");
        Assertions.assertEquals(2, MrMeeseeks.getNumberOfMeeseeks());
        MrMeeseeks meeseeks3 = new MrMeeseeks("Get groceries");
        Assertions.assertEquals(3, MrMeeseeks.getNumberOfMeeseeks());

    }
}
