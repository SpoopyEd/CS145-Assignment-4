// Eduardo Aguilera
// CS145
// 2/2/2026
// Demonstrate use of try catch
// User creates an account, inputs are then converted into appropriate date type
import java.util.Scanner;
public class Assignment4 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        System.out.println("Welcome to Account Creation, Please type out your preffered Username");
        String username = input.nextLine();
        System.out.println("Please type out your date of birth in digit form MMDDYYYY");
        int dob = input.nextInt();
        // try catch statement
        System.out.println("Please type out your adress");
        String address = input.nextLine();
        System.out.println("Please type out your phone number");
        int phoneNumber = input.nextInt();
        // try catch statement
        Account account = new Account(username, dob, address, phoneNumber);
        System.out.printf(""); // print account information
    }
}
