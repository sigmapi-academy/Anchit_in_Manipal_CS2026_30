package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WtiteDataInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();
        String path = "DataFiles/"+filename+".txt"; 
        try(FileWriter fw = new FileWriter(path, true)){
            fw.write("101, Rahul, 85\n");
            fw.write("102, Anchit, 95\n");
            fw.write("103, Aaditya, 55\n");
            fw.write("104, Raman, 65\n");
            fw.write("105, Aman, 75\n");
            System.out.println("Data written successfully.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
