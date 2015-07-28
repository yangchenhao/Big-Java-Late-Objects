/*Implement a class Address . An address has a house number, a street, an optional
apartment number, a city, a state, and a postal code. Supply two constructors: one
with an apartment number and one without. Supply a print method that prints the
address with the street on one line and the city, state, and zip code on the next line.
Supply a method public boolean comesBefore(Address other) that tests whether this
address comes before another when the addresses are compared by postal code.*/

public class P8_04 {
    int houseNumber;
    String street;
    int apartmentNumber;
    String city;
    String state;
    int postalCode;

    public P8_04(int houseNumber, String street, String city, String state, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public P8_04(int houseNumber, String street, int apartmentNumber, String city, String state, int postalCode) {
        this(houseNumber, street, city, state, postalCode);
        this.apartmentNumber = apartmentNumber;
    }

    public void printAddress() {
        System.out.printf("Street: %s House number: %s \n", this.street, this.houseNumber);
        System.out.printf("City: %s State: %s Postal Code: %d\n", this.city, this.state, this.postalCode);
    }

    public boolean comesBefore(P8_04 other) {
        if (this.postalCode < other.postalCode) {
            return true;
        } else {
            return false;
        }
    }
}