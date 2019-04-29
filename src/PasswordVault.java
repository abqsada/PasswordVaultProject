/*
* This class holds accounts and associated passwords
* Passwords need to tbe encrypted
* Vault accessed with Master Password
*/

import java.util.ArrayList;

public class PasswordVault {
    
    PasswordVault() {
        String vault[][] = new String[2][21];
        int i, j = 0;
        String k = "null";
        
        // Test print empty vault
        for(i=0;i<vault.length;i++){
            for(j=0;j<vault.length;j++) {
                vault[i][j]= k;
            }
        }

        for(i=0;i<vault.length;i++){
            for(j=0;j< vault.length;j++) {
                System.out.print(vault[i][j]+" ");
            }
        }
    }

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
