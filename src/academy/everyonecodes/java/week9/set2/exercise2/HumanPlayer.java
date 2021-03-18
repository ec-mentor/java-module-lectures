package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Moves;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HumanPlayer implements Player {
    private Scanner scanner = new Scanner(System.in);
    private List<Move> moves = Moves.get();

    @Override
    public Move chooseMove() {
        while (true) {
            var movesString = Moves.get().stream()
                    .map(Move::getName)
                    .collect(Collectors.joining(", "));
            System.out.println("These are your options: " + movesString + "\nChoose one:");
            var playerOneMove = scanner.nextLine();
            var move = moves.stream()
                    .filter(elem -> elem.getName().equals(playerOneMove))
                    .findFirst();
            if (move.isPresent()) {
                return move.get();
            }
        }
    }
}
