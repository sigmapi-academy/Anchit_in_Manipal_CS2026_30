package BinaryFileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteBinary {
    public static void main(String[] args) {
        String fileName, path = "DataFiles/BinaryFiles/";
        System.out.println("Enter file name: ");
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();

        try (FileOutputStream fio = new FileOutputStream(path+fileName, true);
            DataOutputStream dos = new DataOutputStream(fio)) {
            System.out.println("Enter roll number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter marks: ");
            double marks = sc.nextDouble();
            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(marks);
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            sc.close();
        }
    }
}
