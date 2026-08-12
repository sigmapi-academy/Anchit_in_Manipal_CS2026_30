package FileHandling;

import java.io.FileInputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        String path = "DataFiles/abc.txt";

        try (FileInputStream fis = new FileInputStream(path)) {
            int i;
            System.out.println("File content: ");
            while ((i = fis.read())!=-1) {
                System.out.print((char)i);
            }
            System.out.println();
        } catch (Exception e) {
            
        }
    }
}
