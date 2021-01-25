package academy.everyonecodes.java.week3.lecture;

public class ExaggeratorMain {
    public static void main(String[] args) {
        Exaggerator exaggerator = new Exaggerator();
        System.out.println("Now testing if exaggerator adds an exclamation mark");
        if (exaggerator.exaggerate("Today is great").equals("Today is great!")) {
            System.out.println("Test succeeded!");
        } else {
            System.out.println("Test failed!");
        }

        System.out.println("Now testing if exaggerator adds an exclamation mark to an empty string");
        if (exaggerator.exaggerate("").equals("!")) {
            System.out.println("Test succeeded!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
