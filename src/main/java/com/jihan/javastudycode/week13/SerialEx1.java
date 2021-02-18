package com.jihan.javastudycode.week13;

import java.io.*;
import java.util.ArrayList;

public class SerialEx1 {
    public static void main(String[] args) {
        String fileName = "UserInfo.ser";

        try(FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos)) {

            UserInfo u1 = new UserInfo("Kim", "12345", 30);
            UserInfo u2 = new UserInfo("Lee", "3333", 20);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);

            System.out.println("직렬화 끝.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
