package academy.everyonecodes.java.week4.lecture;

public class MrMeeseeks {
    private String task;
    private static int numberOfMeeseeks = 0;

    public MrMeeseeks(String task) {
        this.task = task;
        numberOfMeeseeks += 1;
    }

    public static int getNumberOfMeeseeks() {
        return numberOfMeeseeks;
    }

    public String doTask() {
        return "I will " + task;
    }
}
