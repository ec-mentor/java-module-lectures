package academy.everyonecodes.java.week9.set2.exercise2.moves;

import java.util.List;

public class Moves {
    public static List<Move> get() {
        return List.of(new RockMove(), new PaperMove(), new ScissorsMove());
    }
}
