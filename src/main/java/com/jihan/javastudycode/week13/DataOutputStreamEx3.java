package com.jihan.javastudycode.week13;

import java.io.*;

public class DataOutputStreamEx3 {
    public static void main(String[] args) throws IOException {
        int[] score = { 100, 90, 95, 85, 50};

        FileOutputStream fos = new FileOutputStream("score.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        for (int j : score) {
            dos.writeInt(j);
        }

        dos.close();

    }
}
