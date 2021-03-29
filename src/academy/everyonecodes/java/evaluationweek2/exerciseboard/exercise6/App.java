package academy.everyonecodes.java.evaluationweek2.exerciseboard.exercise6;

public class App {
    private String name;
    private String category;

    public App(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        App app = (App) o;

        if (name != null ? !name.equals(app.name) : app.name != null) return false;
        return category != null ? category.equals(app.category) : app.category == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
