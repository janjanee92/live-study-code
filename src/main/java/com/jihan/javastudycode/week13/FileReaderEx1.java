package com.jihan.javastudycode.week13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) {
        String fileName = "test.txt";

        try(FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName)) {

            int data;

            while((data = fis.read()) != -1) {
                System.out.print((char)data);
            }

            System.out.println();

            while((data=fr.read()) != -1) {
                System.out.print((char)data);
            }

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
