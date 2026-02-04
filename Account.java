// Eduardo Aguilera
// CS145
// 2/3/2026
// Account, a class that creates employee accounts with information such as:
// Account Username
// Account Date of Birth
// Account Address
// Account Pin

public class Account {
    private String username; // initializes username
    private int dob; // initializes date of birth
    private String address; // initializes address
    private int pin; // initializes pin

    public Account() {

    }
    public Account(String username, int dob, String address, int pin) { // constructor method, constructs a new account
        this.username = username;
        this.dob = dob;
        this.address = address;
        this.pin = pin;
    } // contructer method ends

    public void setUsername(String username) {
        this.username = username; // sets username to username given
    }

    public String getUsername() { // gets username
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
    public void setPin(int pin) { // sets phone number
        this.pin = pin;
    }

    public int getPin() { // gets phone number
        return pin;
    }

}
