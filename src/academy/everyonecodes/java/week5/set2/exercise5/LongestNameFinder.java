package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class LongestNameFinder {

    public Optional<Character> find(List<Character> characters) {
        if (characters.isEmpty()) {
            return Optional.empty();
        }
        Character longestNameCharacter = characters.get(0);
        for (Character character : characters) {
            if (character.getName().length() > longestNameCharacter.getName().length()) {
                longestNameCharacter = character;
            }
        }
        return Optional.of(longestNameCharacter);
    }
}
