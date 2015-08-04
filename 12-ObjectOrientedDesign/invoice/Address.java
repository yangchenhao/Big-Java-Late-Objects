package invoice;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String name, String street, String city, String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String format() {
        String address= String.format("%s\n%s\n%s\n%s\n%s\n", this.name, this.street, this.city, this.state, this.zip);
        
        return address;
    }
}