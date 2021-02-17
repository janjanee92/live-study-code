package com.jihan.javastudycode.week13;

import java.io.File;
import java.io.FilenameFilter;

public class FileEx7 {
    public static void main(String[] args) {

        File dir = new File(System.getProperty("user.dir") + "/com/jihan/javastudycode/week13");
        final String pattern = args[0];

        System.out.println(dir);

        String [] files = dir.list((dir1, name) -> name.indexOf(pattern) != -1);

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

    }
}
