package com.jihan.javastudycode.week13;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {

        int[] score = {100, 85, 90, 60};

        try {

            RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");

            for (int i = 0; i < score.length; i++) {
                raf.writeInt(score[i]);
            }

            raf.seek(0);

            while (true) {
                System.out.println(raf.readInt());
            }

        } catch (EOFException eof) {
            // readInt()를 호출했을 때 더 이상 읽을 내용이 없으면 EOFException 발생
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
