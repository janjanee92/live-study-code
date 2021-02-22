package com.jihan.javastudycode.week14;

public class Juicer {

    static <T extends Fruit> Juice makeJuice(FruitBox<? extends T> box) {
        StringBuilder tmp = new StringBuilder();

        for (Fruit f : box.getList()) {
            tmp.append(f).append(" ");
        }
        return new Juice(tmp.toString());
    }

}
