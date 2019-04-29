/* */

import java.util.Scanner;

public class ManagePassword {

    // Method to save a password
    public void save() {
        // Meets password criteria

        // store in memory

    }

    // Encrypt a password
    public void encrypt() {
        // Use a cipher to scramble the given password in the vault


    }

    // User generated password for an account
    public static void inputNewPassword() {

        System.out.println("Username: ");

        System.out.println("Password: ");

        System.out.println("What's this account for? ");

    }

    public static void deletePassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which account would you like to remove: ");
        String account = input.next();

    }
}
