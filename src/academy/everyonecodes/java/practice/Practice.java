package academy.everyonecodes.java.practice;

import academy.everyonecodes.java.practice.Example;

import java.util.List;

public class Practice {

    public static void main(String[] args) {
        Example example = new Example("Foo", "bar");
        System.out.println(example);
        System.out.println(reverse("asdfjkl"));

        Person person1 = new Person("Joe", 12);
        Person person2 = new Person("Joe", 12);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        List<Person> people = List.of(person1);
        System.out.println(people.contains(person2));
    }

    public static String reverse(String string) {
        String returnValue = "";
        for (int i = string.length() - 1; i > 0; i--) {
            returnValue += string.charAt(i);
        }
        return returnValue;
    }
}
