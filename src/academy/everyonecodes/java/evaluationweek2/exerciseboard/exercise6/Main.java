package academy.everyonecodes.java.evaluationweek2.exerciseboard.exercise6;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<App> apps = null;
        try {
            apps = new AppReader().read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(apps);
    }
}
