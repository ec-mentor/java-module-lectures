package academy.everyonecodes.java.week9.set2.exercise2.moves;

public abstract class Move {
    private String name;

    public Move(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Move{" +
                "name='" + name + '\'' +
                '}';
    }
}
