public class regularteacher {
    private Name name;
    private Address address;
    private int quali;
    private int IC;
    private int salary;
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

    public void setsalary(int quali){
        if (quali <5){
            this.salary = 2000;
        }
        else if (quali<10){
            this.salary = 4000;
        }
        else if (quali < 15){
            this.salary = 8000;
        }
        else { this.salary =10000;}
    }
    public int getsalary(){return salary;}
}
