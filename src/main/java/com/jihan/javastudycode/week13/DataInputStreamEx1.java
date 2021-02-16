package com.jihan.javastudycode.week13;

import java.io.*;

public class DataInputStreamEx1 {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("sample.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);

            dos.close();

            FileInputStream fis = new FileInputStream("sample.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());

            dis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
