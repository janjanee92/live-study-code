package com.jihan.javastudycode.week11;

public class MyEnumEx {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        Color green  = Color.GREEN;
        Color red = Color.RED;

        System.out.printf("%s , %d%n",blue.name, blue.ordinal);
        System.out.printf("%s , %d%n",green.name, green.ordinal);
        System.out.printf("%s , %d%n",red.name, red.ordinal);
    }
}
