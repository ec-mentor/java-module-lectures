package academy.everyonecodes.java.week2.lecture2.appendix;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void makeSound() {
        System.out.println("Woof!");
    }

    public void makeSoundNonStatic() {
        System.out.println("Woof! I'm " + name);
    }
}
