package Address;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address() {

    }

    public static void main(String[] args) {
        createAddress();
    }

    public int getIndex() {
        return this.index;
    }

    public int setIndex(int idx) {
        return this.index = idx;
    }

    public String getCountry() {
        return this.country;
    }

    public String setCountry(String country) {
        return this.country = country;
    }

    public String getСity() {
        return this.city;
    }

    public String setCity(String city) {
        return this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public String setStreet(String street) {
        return this.street = street;
    }

    public int getHouse() {
        return this.house;
    }

    public int setHouse(int house) {
        return this.house = house;
    }

    public int getApartment() {
        return this.apartment;
    }

    public int setApartment(int apartment) {
        return this.apartment = apartment;
    }

    static void createAddress() {
        Address addr = new Address();
        addr.setIndex(54040);
        addr.setCountry("Ukraine");
        addr.setCity("Mykolaiv");
        addr.setStreet("Kurortna");
        addr.setHouse(23);
        addr.setApartment(47);

        System.out.printf("%d, %s, %s %s, %d, %d", addr.getIndex(), addr.getCountry(), addr.getСity(),
                addr.getStreet(), addr.getHouse(), addr.getApartment());
    }
}