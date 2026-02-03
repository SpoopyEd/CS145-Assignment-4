// Eduardo Aguilera
// CS145
// 1/13/26
// Account, a class that creates employee accounts with information such as:
// Employee Name
// Employee Date of Birth
// Employee Address
// Employee Number
import java.security.SecureRandom;

public class Account {
    private String name; // initializes name
    private String dob; // initializes date of birth
    private String address; // initializes address
    private final int employeeNum; // initializes employee number
    private static final SecureRandom randomNumbers = new SecureRandom(); // not 100% sure how this works but it is used
    // to create a random number generator and is featured in the deck of cards code shown in class

    public Account(String name, String dob, String address) { // constructor method, constructs a new account
        this.name = name;
        this.dob = dob;
        this.address = address;
        employeeNum = randomNumbers.nextInt(1000); // assigns new employee account with a random number 1-1000
    } // contructer method ends

    public void setName(String name) {
        this.name = name; // sets name to name given
    }

    public String getName() { // gets name
        return name;
    }
    public void setDob(String dob) {
        this.dob = dob; // sets date of birth to dob given
    }

    public String getDob() { // gets date of birth
        return dob;
    }
    public void setAddress(String address) {
        this.address = address; // sets address to address given
    }

    public String getAddress() { // gets address
        return address;
    }

    // no setEmployeeNum as it is assigned on account creation and is a final value that can not be modified

    public int getEmployeeNum() { // gets employee number
        return employeeNum;
    }

}
