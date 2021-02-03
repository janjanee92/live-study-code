package com.jihan.javastudycode.week11;

enum Coffee {
    AMERICANO(10, "A"),
    LATTE(20, "L"),
    MOCHA(30, "M"),
    CAPPUCCINO(40, "C");

    private final int value;
    private final String symbol;

    Coffee(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() { return value; }
}

public class EnumEx1 {

    public static void main(String[] args) {
        Coffee c1 = Coffee.AMERICANO;
        Coffee c2 = Coffee.valueOf("LATTE");
        Coffee c3 = Enum.valueOf(Coffee.class, "AMERICANO");

        System.out.println("c1 = " + c1);
        System.out.println("c1 = " + c2);
        System.out.println("c1 = " + c3);

        System.out.println("c1 == c2 ? " + (c1 == c2));
        System.out.println("c1 == c3 ? " + (c1 == c3));
        System.out.println("c1.equals(c3) ? " + (c1.equals(c3)));
        System.out.println("c1.compareTo(c3) ? " + (c1.compareTo(c3)));
        System.out.println("c1.compareTo(c2) ? " + (c1.compareTo(c2)));

        switch (c1) {
            case AMERICANO -> System.out.println("Coffee is AMERICANO.");
            case LATTE -> System.out.println("Coffee is LATTE.");
            default -> System.out.println("None Coffee.");
        }

        Coffee[] cArr = Coffee.values();

        for (Coffee c : cArr) {
            System.out.printf("%s = %d%n", c.name(), c.ordinal());
        }

    }

}
