package academy.everyonecodes.java.consolidation.set2.exercise1;

public class Main {
    public static void main(String[] args) {
        char fromNumber = '1';
        char example = '0';
        int d = fromNumber - example;
        System.out.println((int)fromNumber);
        System.out.println((int)example);
        System.out.println(d);

        int d2 = Character.getNumericValue('2');
        int d3 = Character.getNumericValue('a');
        System.out.println(d2);
        System.out.println(d3);
    }
}
