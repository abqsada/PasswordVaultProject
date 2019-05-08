/*
* This class holds accounts and associated passwords
* Passwords need to tbe encrypted
* Vault accessed with Master Password
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PasswordVault {

    public static void main(String[] args) {
        // Create Vault
        String[][] passwords = new String[21][3];

        // Column headers
        passwords[0][0] = "Account";
        passwords[0][1] = "Username";
        passwords[0][2] = "Password";
        // Test print empty vault
        System.out.println("\t\t\t\tVault");
        int row;
        int column;
        int count = 0;
        for(row=0; row  <21 ; row++) {
            for(column=0; column < 3; column++){
                if (row != 0 && column % 3 == 0 ) {
                    System.out.println(count);
                    count++;
                    column = 0;
                }
                System.out.print(passwords[row][column] + "   |   ");
            }
        }

        // Write Vault to .txt file
    }

    // Encrypt the vault

    // Decrypt the vault
    public static void openSesame(String pwAttempt) {
        // when running, password will decrypt, otherwise vault displays faulty passwords.
        String testPhrase = "Benvenuta ragazza, piacere di rivederti";
       

        // reserve first password as a phrase

        // Print out all vault entries
    }


}

