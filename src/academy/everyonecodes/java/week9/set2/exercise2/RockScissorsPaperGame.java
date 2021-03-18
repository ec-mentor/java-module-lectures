package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Moves;

import java.util.stream.Collectors;

public class RockScissorsPaperGame {
    public void playGame() {
        var movesString = Moves.get().stream()
                .map(Move::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Let’s play " + movesString + "!");
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();
        while (true) {
            var playerOneMove = humanPlayer.chooseMove();
            var playerTwoMove = computerPlayer.chooseMove();
            System.out.println("Player 1 chose: " + playerOneMove);
            System.out.println("Player 2 chose: " + playerTwoMove);
//            if (playerOneMove.equals("rock") && playerTwoMove.equals("scissors") || // player one wins
//                    playerOneMove.equals("paper") && playerTwoMove.equals("rock")||
//                    playerOneMove.equals("scissors") && playerTwoMove.equals("paper")
//            ) {
//                System.out.println("You win!");
//            } else if (playerOneMove.equals(playerTwoMove)) { // draw
//                System.out.println("You are both winners!");
//            } else { // player two wins
//                System.out.println("Computer wins!");
//            }
//
//            System.out.println("Do you want to play again? (yes/no)");
//            var yesNoAnswer = scanner.nextLine();
//            if (yesNoAnswer.equals("no")) {
//                break;
//            }
        }
//        System.out.println("See you next time!");
    }
}
