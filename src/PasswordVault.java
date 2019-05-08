/*
* This class holds accounts and associated passwords
* Passwords need to tbe encrypted
* Vault accessed with Master Password
*/

import com.sun.xml.internal.txw2.output.DataWriter;

import java.io.*;

public class PasswordVault {

    private final static int[] chain = {
        1563, 198, 6549, 516, 5287, 794, 3894, 9456
    };

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
        // write(String account, String username, String password);
    }

    public static void write(String stuff) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(passwords.txt)));
            writer.write(stuff);
            writer.flush();
            writer.close();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Encrypt the vault
    public static String encrypt(String key) {
        String result = " ";
        int l = key.length();
        char ch;
        int ck = 0;
        for (int i = 0; i < l; i++) {
            if (ck >= chain.length - 1) {
                ck =0;
            }
            ch = key.charAt(i);
            ch += chain[ck];   //**** Issue: better encryption****
            result += ch;
            ck++;
        }
        return result;
    }

    // Decrypt the vault
    public static String openSesame(String key) {
            String result = " ";
            int l = key.length();
            char ch;
            int ck = 0;
            for (int i = 0; i < l; i++) {
                if (ck >= chain.length - 1) {
                    ck = 0;
                }
                ch = key.charAt(i);
                ch -= chain[ck];   //**** Issue: better encryption****
                result += ch;
            }
            return result;
        }
    }

