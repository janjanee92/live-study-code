package com.jihan.javastudycode.week13;

import java.io.*;
import java.util.Properties;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/main/java/com/jihan/javastudycode/week13/BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr)) {

            String line = "";

            for(int i = 1; (line = br.readLine()) != null; i++) {
                // ";"을 포함한 라인을 출력한다.
                if(line.indexOf(";") != -1)
                    System.out.println(i + ": " + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
