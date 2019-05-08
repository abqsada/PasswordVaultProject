/* */

import java.util.Scanner;

public class ManagePassword {

    // User generated password for an account
    public void newPassword() {
        Scanner input = new Scanner(System.in);

        System.out.println("What's this account for? ");
        String account = input.next();
        System.out.println("Username: ");
        String username = input.next();
        System.out.println("Password: ");
        String password = input.next();
        this.save(account, username, password);
    }

    // Method to save a password
    public void save(String account, String username, String password) {
        // encrypt password
        String pWord = PasswordVault.encrypt(password);
        // Write to passwords.txt file
        PasswordVault.write(account);
        PasswordVault.write(username);
        PasswordVault.write(pWord);
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
