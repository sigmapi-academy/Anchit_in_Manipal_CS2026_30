package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadingFileInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();
        String path = "DataFiles/"+filename+".txt"; 
        try{
            String data = Files.readString(Path.of(path));
            System.out.println(data);
        } 
        catch(IOException e){
            e.printStackTrace();
        }  
        finally{
            sc.close();
        } 
    }

}
