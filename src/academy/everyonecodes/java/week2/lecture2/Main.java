package academy.everyonecodes.java.week2.lecture2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        AddressPrinter printer = new AddressPrinter();
//        Address address = new Address("Sachsenplatz 4-6", 1200, "Vienna", "Austria");
//        printer.print(address);
//
//        Address otherAddress = new Address("Siemensstraße 4-6", 1210, "Vienna", "Austria");
//        printer.print(otherAddress);

//        StringTransformer transformer = new StringTransformer();
//        String example = "Hello, World";
//        if (example.length() > 10) {
//            example = transformer.upperCase(example);
//        } else {
//            example = example.toLowerCase();
//        }
//        example = transformer.reverse(example);


        Address address = new Address("Sachsenplatz 4-6", 1200, "Vienna", "Austria");
        Address sameAddress = address;
        Address otherAddress = new Address("Sachsenplatz 4-6", 1200, "Vienna", "Austria");
        if (address == sameAddress) { // Testing for identity, not equality
            System.out.println("They're identical");
        }

        if (address.equals(otherAddress)) {
            System.out.println("They're the same");
        }

        List<Address> addresses = List.of(address);
        System.out.println(addresses.contains(otherAddress));

    }


}
