// Eduardo Aguilera
// CS145
// 2/3/2026
// Account, a class that creates employee accounts with information such as:
// Account Username
// Account Date of Birth
// Account Address
// Account Phone Number

public class Account {
    private String username; // initializes username
    private int dob; // initializes date of birth
    private String address; // initializes address
    private int phoneNumber; // initializes phone number

    public Account() {

    }
    public Account(String username, int dob, String address, int phoneNumber) { // constructor method, constructs a new account
        this.username = username;
        this.dob = dob;
        this.address = address;
        this.phoneNumber = phoneNumber;
    } // contructer method ends

    public void setusername(String username) {
        this.username = username; // sets username to username given
    }

    public String getusername() { // gets username
        return username;
    }
    public void setDob(int dob) {
        this.dob = dob; // sets date of birth to dob given
    }

    public int getDob() { // gets date of birth
        return dob;
    }
    public void setAddress(String address) {
        this.address = address; // sets address to address given
    }

    public String getAddress() { // gets address
        return address;
    }
    public void setPhoneNumber(int phoneNumber) { // sets phone number
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() { // gets phone number
        return phoneNumber;
    }

}
