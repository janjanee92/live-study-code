package com.jihan.javastudycode.week13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
