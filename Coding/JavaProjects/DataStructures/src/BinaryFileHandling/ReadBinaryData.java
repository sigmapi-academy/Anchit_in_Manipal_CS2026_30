package BinaryFileHandling;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadBinaryData {
    public static void main(String[] args) {
        String fileName, path = "DataFiles/BinaryFiles/";
        System.out.println("Enter file name: ");
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();
        
        try (FileInputStream fis = new FileInputStream(path+fileName);
            DataInputStream dis = new DataInputStream(fis)){
                while (true) {
                    int roll = dis.readInt();
                    String nm = dis.readUTF();
                    double m = dis.readDouble();
                    System.out.println("Roll number: " +roll);
                    System.out.println("Name: " + nm);
                    System.out.println("Marks: "  + m);
                }
                    
        } 
        catch(EOFException eofe){
            System.out.println("=============================");
            System.out.println("End of File.");    
            System.out.println("=============================");
        }
        catch (FileNotFoundException e) {
            
            e.printStackTrace();
            System.err.println("File is not present in the given folder.");
        } catch (IOException e1) {
            e1.printStackTrace();
            System.err.println("Network error");
        }
        
        finally{
            sc.close();
        }
    }
}
