/* */

import java.util.Scanner;

public class ManagePassword {
    // keep track of password placement
    public static int subscript = 0;

    // User generated password for an account
    public static void newPassword() {
        Scanner input = new Scanner(System.in);

        System.out.println("What's this account for? ");
        String account = input.next();
        System.out.println("Username: ");
        String username = input.next();
        System.out.println("Password: ");
        String password = input.next();
        save(account, username, password);
    }

    // Method to save a password
    public static void save(String account, String username, String password) {
        // set subscript
        subscript++;
        // encrypt password
        String pWord = PasswordVault.encrypt(password);
        // enter into vault
        PasswordVault.newAccount(subscript, account, username, pWord);
        // Format new entry
        PasswordVault.writeAppend("\n" + subscript);
        // Write to passwords.txt file
        PasswordVault.writeAppend(account);
        PasswordVault.writeAppend(username);
        PasswordVault.writeAppend(pWord);
    }

    public static void deletePassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which account would you like to remove: ");
        String delAccount = input.next();
        input.close();
        //Parse account column for matching accountName
        // Set account info to null

    }
}
