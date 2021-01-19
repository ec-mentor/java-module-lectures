package academy.everyonecodes.java.week2.lecture2.appendix;

public class Main {

    public static void main(String[] args) {
        Dog.makeSound();
        Dog dog = new Dog("Snoopy");
        dog.makeSoundNonStatic();
        Dog otherDog = new Dog("Woofy");
        otherDog.makeSoundNonStatic();
    }
}
