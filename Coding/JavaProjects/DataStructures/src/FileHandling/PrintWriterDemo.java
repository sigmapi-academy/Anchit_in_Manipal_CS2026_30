package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();
        String path = "DataFiles/"+filename+".txt"; 
        try(FileWriter fw = new FileWriter(path, true);
    PrintWriter pw = new PrintWriter(fw)){
            do{
                System.out.println("Enter roll number: ");
                int rn = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine();
                // pw.println(rn+", "+name+", "+marks);
                pw.printf("%d, %s, %d%n", rn, name, marks);
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
