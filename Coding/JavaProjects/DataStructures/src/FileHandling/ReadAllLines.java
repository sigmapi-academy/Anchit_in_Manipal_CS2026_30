package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadAllLines {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("DataFiles/students.txt"));

            for(String line : lines){
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
