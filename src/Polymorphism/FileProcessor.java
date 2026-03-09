package Polymorphism;
class FileProcessor {

    void processFile(){
        System.out.println("Processing file");
    }
}
class TextFileProcessor extends FileProcessor {

    void processFile(){
        System.out.println("Processing text file");
    }
}
class ImageFileProcessor extends FileProcessor {

    void processFile(){
        System.out.println("Processing image file");
    }
}
class AudioFileProcessor extends FileProcessor {

    void processFile(){
        System.out.println("Processing audio file");
    }
}
 class FileSystem {
    public static void main(String[] args) {

        FileProcessor files[] = {
                new TextFileProcessor(),
                new ImageFileProcessor(),
                new AudioFileProcessor()
        };
        for(FileProcessor f : files){
            f.processFile();
        }
    }
}