package com.jihan.javastudycode.lang;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringEx3 {
    public static void main(String[] args) {
        String coffees = "latte,americano,mocha";
        String[] arr = coffees.split(",");
        String str = String.join("/", arr);
        System.out.println(str);

        StringJoiner sj = new StringJoiner("|", "[", "]");
        for (String s : arr) {
            sj.add(s.toUpperCase());
        }

        System.out.println(sj.toString());

        String han = "한";
        byte[] bArr = han.getBytes(StandardCharsets.UTF_8);
        byte[] bArr2 = han.getBytes(StandardCharsets.UTF_16);

        System.out.println("UTF-8:" + joinByteArr(bArr));
        System.out.println("UTF-16:" + joinByteArr(bArr2));

        System.out.println("UTF-8:" + new String(bArr, StandardCharsets.UTF_8));
        System.out.println("UTF-16:" + new String(bArr2, StandardCharsets.UTF_16));

        int i = Integer.parseInt("100");
        int i2 = Integer.valueOf("200");
        boolean b = Boolean.parseBoolean("true");
        boolean b2 = Boolean.valueOf("false");
        StringBuffer sb = new StringBuffer();
    }

    private static String joinByteArr(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bArr) {
            sj.add(String.format("%02X", b));
        }
        return sj.toString();
    }
}
