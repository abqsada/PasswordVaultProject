// Read and write to file
// reference: https://caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html#writetext

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowPassword {


    // Reads the entire passwords file.
    public static void showAll(){
        // The name of the file to open.
        String fileName = "passwords.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +
                    fileName + "'");
        } catch(IOException ex) {
            System.out.println(
                "Error reading file '"
                    + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}


