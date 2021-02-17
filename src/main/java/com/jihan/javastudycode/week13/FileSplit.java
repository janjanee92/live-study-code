package com.jihan.javastudycode.week13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileSplit {
    public static void main(String[] args) {

        final int VOLUME = Integer.parseInt(args[1]);

        String filename = args[0];

        try (FileInputStream fis = new FileInputStream(filename);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ){
            FileOutputStream fos = null;
            BufferedOutputStream bos = null;

            int data = 0;
            int i = 0;
            int number = 0;

            while((data = bis.read()) != -1) {
                if (i % VOLUME == 0) {
                    if (i != 0) {
                        bos.close();
                    }

                    fos = new FileOutputStream(filename + "_." + ++number);
                    bos = new BufferedOutputStream(fos);
                }
                bos.write(data);
                i++;
            }

            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
