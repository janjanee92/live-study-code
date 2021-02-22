package com.jihan.javastudycode.week14;

public class Juicer {

    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        StringBuilder tmp = new StringBuilder();

        for (Fruit f : box.getList()) {
            tmp.append(f).append(" ");
        }
        return new Juice(tmp.toString());
    }

}
