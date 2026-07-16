package PracticingFiles;

import java.io.File;
import java.util.Scanner;

public class RenameFile {
    public static void main(String[] args) {
        String Path = "DataFiles";
        String oldFileName, newFileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter old file name: ");
        oldFileName = sc.nextLine();
        
        System.out.println("Enter new file name: ");
        newFileName = sc.nextLine();
        sc.close();

        File oldFile = new File(Path,oldFileName);
        File newFile = new File(Path,newFileName);
        if(oldFile.renameTo(newFile)){
            System.out.println("File renamed Successfully.");
        }
        else{
            System.out.println("Rename failed");
        }
    }
}
