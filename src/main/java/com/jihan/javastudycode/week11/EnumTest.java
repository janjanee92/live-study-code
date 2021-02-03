package com.jihan.javastudycode.week11;

public class EnumTest {
    public static void main(String[] args) {
        Pizza[] pizzas = Pizza.values();

        for (Pizza pizza : pizzas) {
            System.out.printf("%s = %d%n", pizza.name(), pizza.ordinal());
        }
    }
}
