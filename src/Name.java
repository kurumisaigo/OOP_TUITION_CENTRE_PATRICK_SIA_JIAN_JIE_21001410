public class Name {
    private String fname;
    private String mname;
    private String lname;
    private String fullname;

    public Name(String fname,String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.fullname = fname +" "+ mname + " "+ lname;
    }

    public String getFname() {return fname;}

    public void setFname(String fname) {this.fname = fname;}

    public String getMname() {return mname;}

    public void setMname(String mname) {this.mname = mname;}

    public String getLname() {return lname;}
    public void setLname(String lname) {this.lname = lname;}
    public String getFullname() {return fullname;}
}
