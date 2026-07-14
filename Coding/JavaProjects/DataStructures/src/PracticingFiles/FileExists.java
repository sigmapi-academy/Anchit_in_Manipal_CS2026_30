package PracticingFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileExists {
    public static void main(String[] args) {
        String path = "DataFiles";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(path, fileName);
        sc.close();
        if(file.exists()){
            System.out.println("File exists.");
            System.out.println("Name of existing file: "+ file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            try {
                System.out.println("Canonical path: "+ file.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Can read = "+file.canRead());
            System.out.println("Can write = "+file.canWrite());
            System.out.println("Can execute = "+file.canExecute());
            System.out.println("File size: " + file.length()+" bytes");
            System.out.println("Is a file: " + file.isFile());
            System.out.println("Is Directory: "+ file.isDirectory());
        }
        else{
            System.out.println("File not found.");
        }
    }
}
