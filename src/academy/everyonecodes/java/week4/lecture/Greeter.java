package academy.everyonecodes.java.week4.lecture;

import java.util.Scanner;

public class Greeter {

//    public void greet() {
//        Scanner scanner = new Scanner(System.in);
//        String question = "Please enter your name.";
//        System.out.println(question);
//        String name = scanner.nextLine();
//        while (!name.isEmpty()) {
//            System.out.println("Hello, " + name);
//
//            System.out.println(question);
//            name = scanner.nextLine();
//        }
//    }

//    public void greet() {
//        Scanner scanner = new Scanner(System.in);
//        String question = "Please enter your name.";
//        System.out.println(question);
//        String name = scanner.nextLine();
//        if (!name.isEmpty()) {
//            System.out.println("Hello, " + name);
//            greet();
//        } else {
//            System.out.println("Done");
//        }
//    }



//    public void count() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//    }

    public void count() {
        count(0);
    }

    private void count(int current) {
        if (current < 5) {
            System.out.println(current);
            count(current + 1);
        }
    }




}
