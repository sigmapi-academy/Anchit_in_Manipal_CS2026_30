package PracticingFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=============File Manager=============");
            System.out.println("1. Create File");
            System.out.println("2. Delete File");
            System.out.println("3. Rename file");
            System.out.println("4. Check File Exists");
            System.out.println("5. Display File Information" );
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter the file name: ");
                    String name = sc.nextLine();
                    File file = new File(name);
                    try {
                        if(file.createNewFile()){
                            System.out.println("File Created Successfully");
                        }
                        else{
                            System.out.println("File Already Exists.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                
                    case 2:
                        System.out.println("Enter file name: ");
                        File deleteFile = new File(sc.nextLine());
                        if(deleteFile.delete()){
                            System.out.println("File Deleted.");
                        }
                        else{
                            System.out.println("Unable to Delete.");
                        }
                        break;
                    
                    case 3:
                        System.out.println("Old File Name: ");
                        File oldFile = new File(sc.nextLine());
                        
                        System.out.println("New File Name: ");
                        File newFile = new File(sc.nextLine());

                        if (oldFile.renameTo(newFile)) {
                            System.out.println("File renamed Successfully.");
                        }
                        else{
                            System.out.println("Renamed Failed");
                        }
                        break;
                    
                    case 4:
                        System.out.println("Enter file name: ");
                        File check = new File(sc.nextLine());
                        System.out.println(check.exists()?"File Exists.": "File Not Found.");
                        break;
                    
                    case 5:
                        System.out.println("Enter file name: ");
                        File info = new File(sc.nextLine());

                        if(info.exists()){
                            System.out.println("Name: " + info.getName());
                            System.out.println("Size: " + info.length() + " bytes");
                            System.out.println("Path: " + info.getAbsolutePath());
                        }
                        else{
                            System.out.println("File does not exist.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        sc.close();
                        System.out.println("Good bye");
                        System.exit(ch);

                default:
                    break;
            }
        }
    }
}
