package PracticingFiles;

import java.io.File;

public class ListFileObjects {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] files = folder.listFiles();

        for (File f : files) {
            if(f.isDirectory()){
                System.out.println("[DIR]: " + f.getName());
                String data[] = f.list();
                System.out.println("Files under: "+f.getName());
                for (String  fl : data) {
                    System.out.println("\t\t" + fl);
                }
            }
            else{
                System.out.println("[FILE]: " + f.getName());
            }
        }
    }
}
