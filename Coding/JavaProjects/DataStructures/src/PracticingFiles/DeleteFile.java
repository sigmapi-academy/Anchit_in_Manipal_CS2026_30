package PracticingFiles;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        //String Path = "DataFiles";
        String fileName, w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = sc.nextLine();
        
        sc.close();

        File file = new File(fileName);
        
        if(file.isDirectory()){
            w = "Directory or Folder";
            System.out.println("Directory");
        }
        else{
            w = "File";
            System.out.println("File");
        }
        if(file.delete()){
            System.out.println(w + " deleted Successfully.");
        }
        else{
            System.out.println(" Unable to delete.");
        }
    }
}
