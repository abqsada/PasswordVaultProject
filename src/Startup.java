import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Startup {

    Startup() {
        displayGreeting();
        verifyPassword();
    }

    // Display the greeting
    public static void displayGreeting() {
        String greeting = "\t\tCRACK THE CODE \n\t\t\tWelcome!\n";
        System.out.println(greeting);
    }

    // Get the accounts tied to your master password
    public static void verifyPassword() {
        Scanner in = new Scanner(System.in);
        String pwAttempt = "null";

        // Ask for master password
        System.out.println("\tTo open or not to open,\n\t that is the question.\n\n Enter Vault Password: ");
        pwAttempt = in.next();

        // verify master password
        if (pwAttempt.equals("Hello")) {   // Stubbed - getVault[0][0]
            // Open vault | Allow menu access
            mainMenu();
        } else {
            System.out.println("Intruder Alert!");
        }
    }

    // Give the user options for functions
    // Called in password verification
    public static void mainMenu() {
        // Show options and exit
        System.out.println( "1 | Search for account info"
                        + "\n2 | Manage your Passwords"
                        + "\n3 | See all Passwords"
                        + "\n4 | Exit");

        // Select an option
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to do? \n(Type 1, 2, 3, 4): ");
        int select = in.nextInt();

        // Take you to your selected option
        if (select == 1) {
            // searchPW from ShowPassword
            System.out.println("Type account name: ");
            String accountSearch = in.next();


        } else if (select == 2) {
            // Manage Passwords Menu - addPW | updatePW | deletePW
            System.out.println("1 | Add new Account to Vault");
            System.out.println("2 | Update a Password in Vault");
            System.out.println("3 | Delete a Password from Vault");
            System.out.println("What would you like to do? \n(Type 1, 2, 3): ");
            int manage = in.nextInt();


            if (manage == 1) {
                ManagePassword.newPassword();
            } else if (manage == 2) {
                ManagePassword.deletePassword();
            } else if (manage == 3) {
                ManagePassword.deletePassword();
                // in.close();
            } else {
                System.out.println("Not a valid option\nReturning to main menu");
                mainMenu();
            }
        } else if (select == 3) {
            // Show vault
        } else if (select == 4) {
            // Exit the application
            System.exit(0);
        }
    }
}
