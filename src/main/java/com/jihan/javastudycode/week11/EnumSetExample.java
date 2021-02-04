package com.jihan.javastudycode.week11;

import java.util.EnumSet;
import java.util.Iterator;

enum Food { PIZZA, COFFEE, CHICKEN, HAMBURGER }

public class EnumSetExample {

    public static void main(String[] args)
    {
        EnumSet<Food> foods = EnumSet.allOf(Food.class);

        System.out.println("EnumSet: " + foods);

        boolean value1 = foods.remove(Food.CHICKEN);
        System.out.println("Is CHICKEN removed? " + value1);

        boolean value2 = foods.removeAll(foods);
        System.out.println("Are all elements removed? " + value2);
    }
}
