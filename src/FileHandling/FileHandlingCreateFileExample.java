package FileHandling;
import java.io.File;
public class FileHandlingCreateFileExample {
    static void main(String[] args) {
        File file = new File("C:\\Users\\kinza\\Desktop\\test.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File Created " + file.getName());
            }
            else {
                System.out.println("File Already Exist"+file.getAbsolutePath());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error Occur");
        }
    }
}
