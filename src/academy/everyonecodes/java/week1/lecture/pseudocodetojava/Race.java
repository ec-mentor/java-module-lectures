package academy.everyonecodes.java.week1.lecture.pseudocodetojava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Race {

    // Shared mutable state "is the root of all evil"

    public static void main(String[] args) {
//        List<String> participantsInOrder = new ArrayList<>();
//        participantsInOrder.add("Willy"); // Willy won the race
//        participantsInOrder.add("Sarah");
//        participantsInOrder.add("John");
//        participantsInOrder.add("Joe");
        List<String> participantsInOrder = List.of("Willy", "Sarah", "John", "Joe");

        displayParticipants(participantsInOrder);
        congratulateWinner(participantsInOrder);

    }

    public static void displayParticipants(List<String> participants) {
        List<String> mutableList = new ArrayList<>(participants);
        mutableList.sort(Comparator.naturalOrder());
        System.out.println(mutableList);
    }

    public static void congratulateWinner(List<String> participants) {
        System.out.println("Congratulations, " + participants.get(0) + "! You won!");
    }

}
