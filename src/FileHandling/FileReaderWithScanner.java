package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWithScanner {
    public static void main(String[] args) {

        try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file); //Opens file for reading

            while (sc.hasNextLine()) { //Checks if more lines exist
                String line = sc.nextLine(); //Reads one line
                System.out.println(line);
            }

            sc.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
