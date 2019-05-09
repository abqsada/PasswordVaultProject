/*
* This class holds accounts and associated passwords
* Passwords need to tbe encrypted
* Vault accessed with Master Password
*/

import com.sun.xml.internal.txw2.output.DataWriter;

import java.io.*;
import java.util.Scanner;

public class PasswordVault {

    private final static int[] chain = {
        1563, 198, 6549, 516, 5287, 794, 3894, 9456
    };
    // Create Vault
    private static String[][] passwords = new String[21][3];

    public static void vaultSetup() {
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
    }

    public static void newAccount(int x, String account, String username, String password) {
        passwords[x][0] = account;
        passwords[x][1] = username;
        passwords[x][2] = password;
    }

    public static void fileSetup() {
        try {
            String headers = "\t\t\tVault\n\tAccount\t|\tUsername\t|\tPassword\t|";
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("passwords.txt")));
            writer.write(headers);
            writer.flush();
            writer.close();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeAppend(String stuff) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("passwords.txt", true));
            writer.append("|\t");
            writer.append(stuff + "\t|");
            writer.close();
            System.out.println("Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String search) {
        Scanner read = new Scanner("passwords.txt");
        read.findInLine(search);
        return read.nextLine();

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
                ch -= chain[ck];
                result += ch;
            }
            return result;
        }
    }

