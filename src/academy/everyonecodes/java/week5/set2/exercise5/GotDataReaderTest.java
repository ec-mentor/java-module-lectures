package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GotDataReaderTest {
    private GotDataReader reader = new GotDataReader();

    @Test
    void read() {
        List<Character> characters = reader.read();
        Character expectedChar1 = new Character("Adrack Humble", "5", "1");
        Character resultChar1 = characters.get(3);
        Assertions.assertEquals(expectedChar1, resultChar1);

        Character expectedChar2 = new Character("Alebelly", "2", "1");
        Character resultChar2 = characters.get(16);
        Assertions.assertEquals(expectedChar2, resultChar2);
    }

}