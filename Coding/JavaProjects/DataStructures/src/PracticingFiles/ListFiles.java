package PracticingFiles;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File folder = new File(".");
        
        String[] files = folder.list();

        for (String file : files) {
            System.out.println(file);
        }
    }
}
