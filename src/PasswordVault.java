/*
* This class holds accounts and associated passwords
* Passwords need to tbe encrypted
* Vault accessed with Master Password
*/

public class PasswordVault {

    PasswordVault() {
        // Create Vault
        String[][] vault = new String[3][21];
        int row;
        int column;
        int count = 0;
        System.out.println("Vault");
        // Test print empty vault
        // Issue: make column headers
        vault[0][0] = "Account";
        vault[1][0] = "Username";
        vault[2][0] = "Password";

        // Issue:
        for(row=0; row  < vault.length * 7 ; row++) {
            for(column=0; column < vault.length; column++){
                if (row != 0 && column % 3 == 0) {
                    System.out.println(count);
                    count++;
                }
                System.out.print(vault[column][row % 21]+"   |   ");

            }
        }
    }

    // Encrypt the vault

    // Decrypt the vault
    public static void openSesame(String pwAttempt) {
        // when running, password will decrypt, otherwise vault displays faulty passwords.
        String testPhrase = "Benvenuti ragazza, piacere di rivederti";
       

        // reserve first password as a phrase

        // Print out all vault entries
    }

    public static void main(String[] args) {
        PasswordVault test = new PasswordVault();
    }

}
