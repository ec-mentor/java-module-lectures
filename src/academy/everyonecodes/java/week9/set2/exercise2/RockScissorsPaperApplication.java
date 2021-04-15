package academy.everyonecodes.java.week9.set2.exercise2;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaperApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        var moves = List.of("rock", "paper", "scissors", "spock", "lizard");
        var movesString = String.join(", ", moves);
        System.out.println("Let’s play " + movesString + "!");
        while (true) {
            System.out.println("These are your options: " + movesString);
            System.out.println("Choose one:");
            var playerOneMove = scanner.nextLine();
            if (!moves.contains(playerOneMove)) {
                continue;
            }
            var playerTwoMove = moves.get(random.nextInt(moves.size()));
            System.out.println("Player 1 chose: " + playerOneMove);
            System.out.println("Player 2 chose: " + playerTwoMove);
            if ( // player one wins
                    (playerOneMove.equals("rock") && (playerTwoMove.equals("scissors") || playerTwoMove.equals("lizard"))) ||
                    (playerOneMove.equals("scissors") && (playerTwoMove.equals("paper") || playerTwoMove.equals("lizard"))) ||
                    (playerOneMove.equals("paper") && (playerTwoMove.equals("rock") || playerTwoMove.equals("spock"))) ||
                    (playerOneMove.equals("lizard") && (playerTwoMove.equals("spock") || playerTwoMove.equals("paper"))) ||
                    (playerOneMove.equals("spock") && (playerTwoMove.equals("scissors") || playerTwoMove.equals("rock")))
            ) {
                System.out.println("You win!");
            } else if (playerOneMove.equals(playerTwoMove)) { // draw
                System.out.println("You are both winners!");
            } else { // player two wins
                System.out.println("Computer wins!");
            }

            System.out.println("Do you want to play again? (yes/no)");
            var yesNoAnswer = scanner.nextLine();
            if (yesNoAnswer.equals("no")) {
                break;
            }
        }
        System.out.println("See you next time!");
    }
}
