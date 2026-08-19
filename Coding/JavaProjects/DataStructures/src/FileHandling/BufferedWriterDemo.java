package FileHandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();
        String path = "DataFiles/"+filename+".txt"; 
        try(FileWriter fw = new FileWriter(path, true);
    BufferedWriter bw = new BufferedWriter(fw)){
            do{
                System.out.println("Enter roll number: ");
                int rn = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine();
                bw.write(rn+", "+name+", "+marks);
                bw.newLine();
                System.out.println("Press Y/y to store more records: ");
                String ch = sc.next();
                if(ch.equalsIgnoreCase("y")){
                    continue;
                }
                else{
                    break;
                }
            }while(true);
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
