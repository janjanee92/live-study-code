package com.jihan.javastudycode.week13;

import java.io.File;

public class FileEx9 {
    public static void main(String[] args) {

        File dir = new File(args[0]);

        File[] list = dir.listFiles();

        for (int i = 0; i < list.length; i++) {

            String fileName = list[i].getName();

            String newFileName = "0000" + fileName;

            newFileName = newFileName.substring(newFileName.length() - 7);
            list[i].renameTo(new File(dir, newFileName));

        }

    }
}
