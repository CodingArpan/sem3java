 // Write a Java Program to read the data from the file using FileInputStream

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
            "D:\\Btech 2022-2026\\Semester 3\\OOP\\Practicals\\Prac8\\Practical-8.pdf");
        try {
        int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }finally{
            if(fis!=null)
            fis.close();
            
        }
    }
}