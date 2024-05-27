public class Address {
    private String street, city, state, zipcode;

    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return street + " " + city + " " + state + " " + zipcode;
    }
}
