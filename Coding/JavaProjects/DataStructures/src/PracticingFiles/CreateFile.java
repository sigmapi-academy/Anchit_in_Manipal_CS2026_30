package PracticingFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        String path = "DataFiles";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(path, fileName);
        sc.close();
        try {
            if(file.createNewFile()){
                System.out.println("FIle Created Successfully.");
            }
            else{
                System.out.println("File Already Exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
