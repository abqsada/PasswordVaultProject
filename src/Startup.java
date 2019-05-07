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
        // Show password button --> JavaFX (if there's time)
        System.out.println("1 | Search for account info");
        // Manage passwords button - will give option to add / update / delete
        System.out.println("2 | Manage your Passwords");
        // Display all passwords button
        System.out.println("3 | See all Passwords");

        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to do? \n(Type 1, 2, 3): ");

        if (in.nextInt() == 1) {
            // searchPW from ShowPassword
        } else if (in.nextInt() == 2) {
            // Menu - addPW | updatePW | deletePW
            System.out.println("1 | Add new Account to Vault");
            System.out.println("2 | Update a Password in Vault");
            System.out.println("3 | Delete a Password from Vault");
            System.out.println("What would you like to do? \n(Type 1, 2, 3): ");
            if (in.nextInt() == 1) {
                ManagePassword.newPassword();
            } else if (in.nextInt() == 2) {
                ManagePassword.deletePassword();
            } else if (in.nextInt() == 3) {
                ManagePassword.deletePassword();
            } else {
                System.out.println("Not a valid option\nReturning to main menu");
                mainMenu();
            }


        } else if (in.nextInt() == 3) {
            // Show vault



        }
    }
}
