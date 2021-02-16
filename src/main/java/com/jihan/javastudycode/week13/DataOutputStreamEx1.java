package com.jihan.javastudycode.week13;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fos;
        DataOutputStream dos;

        try {
            fos = new FileOutputStream("sample.dat");
            dos = new DataOutputStream(fos);

            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);

            dos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
