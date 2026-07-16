package PracticingFiles;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        String path = "StudentData";
        File dir = new File(path+"/sem1/Sub2");

        if(dir.mkdirs()){
            System.out.println("Sub-Directories Created");
        }
        else{
            System.out.println(" Sub-Directories already exist");
        }
    }
}
