// Eduardo Aguilera
// CS145
// 2/2/2026
// Demonstrate use of try catch
// User creates an account, inputs are then converted into appropriate date type
import java.util.Scanner;
public class Assignment4 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        boolean correctIn = false; // initalizing correct input, keeps a loop going until user gives correct input
        String username; // initializing username
        int dob = 0; // initialzing date of birth
        String address; // initialzing adress
        int phoneNumber = 0; // initializing phone number
        System.out.println("Welcome to Account Creation, Please type out your preffered Username");
        username = input.nextLine();
        System.out.println("Please type out your date of birth in digit form MMDDYYYY");
        while (correctIn == false) {
            try {
                dob = input.nextInt();
                correctIn = true;
            } catch (Exception e) {
                System.out.println("Date of birth must be in digit form MMDDYYYY, no letters or symbols allowed");
            } finally {
                input.nextLine(); // clears input so that there are no issues when calling nextLine() or infinite catch loop
            }
        } correctIn = false; // resets loop for next prompt
        System.out.println("Please type out your address");
        address = input.nextLine();
        System.out.println("Please type out your phone number");
        while (correctIn == false) {
            try {
                phoneNumber = input.nextInt();
                correctIn = true;
            } catch (Exception e) {
                System.out.println("Phone number must be in digit form, no letters or symbols allowed");
            } finally {
                input.nextLine(); // clears input so that there are no issues when calling nextLine() or infinite catch loop
            }
        }
        Account account = new Account(username, dob, address, phoneNumber);
        System.out.printf("Account Created %n Username: %s,%n Date of Birth: %d,%n Address: %s,%n Phone Number: %d", account.getUsername(), account.getDob(), account.getAddress(), account.getPhoneNumber()); // print account information
    }
}
