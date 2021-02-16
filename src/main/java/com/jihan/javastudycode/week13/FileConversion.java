package com.jihan.javastudycode.week13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion {
    public static void main(String[] args) {

        String fileName = "test.txt";

        try(FileReader fr = new FileReader("test.txt");
            FileWriter fw = new FileWriter("convert.txt")) {

            int data;

            while((data=fr.read()) != -1) {

                if (data != '\t' && data != '\n' && data != ' ' && data != '\r'){
                    fw.write(data);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
