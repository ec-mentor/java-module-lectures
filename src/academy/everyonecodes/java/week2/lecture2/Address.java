package academy.everyonecodes.java.week2.lecture2;

import java.util.Objects;

public class Address {
    private String streetName;
    private int zipCode;
    private String city;
    private String country;

    public Address(String streetName, int zipCode, String city, String country) {
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return zipCode == address.zipCode && streetName.equals(address.streetName) && city.equals(address.city) && country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, zipCode, city, country);
    }
}
