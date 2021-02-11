package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.util.ArrayList;
import java.util.List;

public class GotDataReader {
    public List<Character> read() {
        FileReader reader = new FileReader();
        List<String> lines = reader.read("src/academy/everyonecodes/java/week5/set2/exercise5/files/got-characters.csv");
        List<Character> characters = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] splitLine = line.split(";");
            Character character = new Character(splitLine[0], splitLine[3], splitLine[6]);
            characters.add(character);
        }
        return characters;
    }
}
