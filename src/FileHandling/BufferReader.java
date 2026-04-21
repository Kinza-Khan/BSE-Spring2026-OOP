package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}

//Why BufferedReader?
//Reads chunks instead of single char
//Faster performance