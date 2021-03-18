package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Moves;

import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {
    private Random random = new Random();
    private List<Move> moves = Moves.get();

    @Override
    public Move chooseMove() {
        return moves.get(random.nextInt(moves.size()));
    }
}
