package FileHandling;

import java.io.File;
import java.io.IOException;

public class PermissionsOfFile {
    static void main(String[] args) {
        File file = new File("rough.txt");

        boolean exec = file.setExecutable(true);
        boolean write = file.setWritable(true);
        boolean read = file.setReadable(true);

        System.out.println("Set Executable: " + exec);
        System.out.println("Set Writable: " + write);
        System.out.println("Set Readable: " + read);

        System.out.println("Final Permissions:");
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
        System.out.println("Can Execute: " + file.canExecute());
    }
}
