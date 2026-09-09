package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModifyRecord {
    public static void main(String[] args) {
        int roll, marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number  to modify: ");
        roll = sc.nextInt();
        System.out.println("Enter new marks: ");
        marks = sc.nextInt();

        File original = new File("DataFiles/students.txt");
        File tempFile = new File("DataFiles/tempStudent.txt");

        try (BufferedReader br = new BufferedReader( new FileReader(original));
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while((line = br.readLine())!= null){
                String[] parts = line.split(", ");
                if(Integer.parseInt(parts[0]) == roll){
                    line = parts[0]+", " + parts[1]+", " + marks;
                }
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        if(original.delete()){
            if(tempFile.renameTo(original)){
                System.out.println("Record updated.");
            }
            else{
                System.out.println("Could not rename temprory file.");
            }
        }
        else{
            System.out.println("Could not delete the original file.");
        }
    }
}
