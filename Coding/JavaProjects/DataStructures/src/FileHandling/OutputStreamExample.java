package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String path = "DataFiles/abc.txt";
        try (FileOutputStream fout = new FileOutputStream(path)){
            String content = new java.util.Scanner(System.in).nextLine();
            fout.write(content.getBytes());
            System.out.println("Data written Successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
