package com.practice.practice.rahulpatil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_Into_Text_File {

    public static void main(String[] args) {

        String filePath = "C:\\Prashant\\MyData.txt";  // Change path as needed

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Hello, this is Rahul!");
            bw.newLine();  // Move to the next line
            bw.write("I am writing data into a text file using Java.");
            bw.newLine();
            bw.write("This is example content.");
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }
    }
}
