package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileUsingBufferedReader {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();
        String path = "DataFiles/"+filename+".txt"; 
        try(FileReader fr = new FileReader(path);
    BufferedReader br = new BufferedReader(fr)){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
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
