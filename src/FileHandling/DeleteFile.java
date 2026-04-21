package FileHandling;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
   public static void main(String[] args) {
       File file = new File("C:\\Users\\kinza\\Desktop\\test.txt");
       boolean fileDelete = file.delete();
       if(fileDelete){
           System.out.println("File Deleted");
       }
       else {
           System.out.println("Not deleted");
       }

   }
}
