package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class WritingToFile {
    static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("test.txt",true);// Opens file for writing
            // (overwrites existing data), true means append (add data instead of overwrite)
//            writer.write("hello this is kinza\n");
//            writer.write("id is "  +21 );
                writer.write("\nBSE-2A OOP Lab 11");
            writer.close(); // saves and closes file
            System.out.println("Data written successfully");

        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Error occurred");
        }
    }
}
