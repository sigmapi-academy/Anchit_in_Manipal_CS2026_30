package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();
        String path = "DataFiles/"+filename+".txt"; 
        try(FileReader fr = new FileReader(path)){
            int d;
            while((d = fr.read()) != -1){
                System.out.print((char)d);
            }
        } 
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }    
        catch(IOException e){
            e.printStackTrace();
        }  
        finally{
            sc.close();
        } 
    }
}
