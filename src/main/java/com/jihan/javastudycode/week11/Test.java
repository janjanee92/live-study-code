package com.jihan.javastudycode.week11;

enum Animal
{
    TIGER, RABBIT, LION
}

enum Day
{
    MONDAY, TUESDAY
}

public class Test
{
    // Driver method 
    public static void main(String[] args)
    {
        Animal a1 = Animal.valueOf("TIGER");
        Animal a2 = Animal.valueOf("RABBIT");
        Day d1 = Day.valueOf("MONDAY");
        Day d2 = Day.valueOf("TUESDAY");

        System.out.print("Class corresponding to "+ a1.name() +" : ");
        System.out.println(a1.getDeclaringClass());

        System.out.print("Class corresponding to "+ a2.name() +" : ");
        System.out.println(a2.getDeclaringClass());

        System.out.print("Class corresponding to "+ d1.name() +" : ");
        System.out.println(d1.getDeclaringClass());

        System.out.print("Class corresponding to "+ d2.name() +" : ");
        System.out.println(d2.getDeclaringClass());
    }
} 