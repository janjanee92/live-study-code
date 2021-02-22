package com.jihan.javastudycode.week14;

import java.util.Comparator;

public class GrapeComp implements Comparator<Grape> {

    @Override
    public int compare(Grape g1, Grape g2) {
        return g2.weight - g1.weight;
    }
}
