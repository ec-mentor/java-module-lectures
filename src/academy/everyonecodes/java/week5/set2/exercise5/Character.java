package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.Objects;

public class Character {

    private String name;
    private String bookOfDeath;
    private String gender;

    public Character(String name, String bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) && Objects.equals(bookOfDeath, character.bookOfDeath) && Objects.equals(gender, character.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bookOfDeath, gender);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", bookOfDeath='" + bookOfDeath + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
