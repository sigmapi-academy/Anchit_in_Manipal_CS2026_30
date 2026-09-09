package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileInString {
    public static void main(String[] args) {
        
        try {
            String data = Files.readString(Path.of("DataFiles/students.txt"));
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
