package com.jihan.javastudycode.week13;

import java.io.*;

public class FileMerge {
    public static void main(String[] args) {

        String mergeFilename = args[0];

        try {
            File tempFile = File.createTempFile("~mergetemp", ".tmp");
            tempFile.deleteOnExit();

            FileOutputStream fos = new FileOutputStream(tempFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            BufferedInputStream bis = null;

            int number = 1;

            File f = new File(mergeFilename + "_." + number);

            while (f.exists()) {
                f.setReadOnly();

                bis = new BufferedInputStream(new FileInputStream(f));

                int data = 0;

                while((data = bis.read()) != -1) {
                    bos.write(data);
                }

                bis.close();

                f = new File(mergeFilename + "_." + ++number);
            }

            bos.close();

            File oldFile = new File(mergeFilename);

            if (oldFile.exists())
                oldFile.delete();

            tempFile.renameTo(oldFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
