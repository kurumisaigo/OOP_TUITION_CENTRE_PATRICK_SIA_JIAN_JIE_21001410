public class freelancerteacher {
    private Name name;
    private Address address;
    private int quali;
    private int IC;
    private float salary;
    public Name getName() {return name;}

    public void setName(String fname, String mname, String lname) {
        this.name = new Name(fname, mname, lname);
    }

    public Address getAddress() {return address;}

    public void setAddress(String unit, String street, String city, String zipcode, String state) {
        this.address = new Address(unit, street, city, zipcode, state);
    }
    public int getQuali() {return quali;}

    public void setQuali(int quali) {this.quali = quali;}

    public float getSalary() {
        return salary;
    }

    public void setSalary(int hours) {
        this.salary = (50 * hours);
    }
}
