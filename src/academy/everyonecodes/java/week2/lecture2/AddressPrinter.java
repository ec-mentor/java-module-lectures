package academy.everyonecodes.java.week2.lecture2;

public class AddressPrinter {
    public void print(Address address) {
        System.out.println(address.getStreetName());
        System.out.println(address.getZipCode() + ", " + address.getCity());
        System.out.println(address.getCountry());
    }
}
