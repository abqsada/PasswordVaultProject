import java.util.Scanner;

public class Startup {

    // Display the greeting
    public static void displayGreeting (){
        String greeting = "Crack the code \n    Welcome";
        System.out.println(greeting);
    }

    // Get the accounts tied to your master password
    public static void getVault() {
        Scanner in = new Scanner(System.in);
        String pwAttempt = "null";

        // Ask for master password
        System.out.println("To open or not to open, that is the question.\n Enter Vault Password: ");
        pwAttempt =in.next();

        // verify master password
        if (pwAttempt.equals("Hello")) {   // Stubbed - getVault[0][0]
            // Open vault | Allow menu access
            mainMenu();
        }
    }

    // Give the user options for functions
    public static void mainMenu() {
        // Show password button --> JavaFX
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
            // Menu - addPW | deletePW
        } else if (in.nextInt() == 3) {
            // Show all PW
        }
    }

    public static void main(String[] args) {
        displayGreeting();
        getVault();
    }
}
