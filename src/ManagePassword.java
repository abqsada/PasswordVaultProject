/* */

import java.util.Scanner;

public class ManagePassword {

    // User generated password for an account
    public static void newPassword() {
        Scanner input = new Scanner(System.in);

        System.out.println("What's this account for? ");
        String account = input.next();
        System.out.println("Username: ");
        String username = input.next();
        System.out.println("Password: ");
        String password = input.next();

    }

    // Method to save a password
    public void save() {
        // Meets password criteria

        // store in memory

    }

    public static void deletePassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which account would you like to remove: ");
        String account = input.next();

    }
}
