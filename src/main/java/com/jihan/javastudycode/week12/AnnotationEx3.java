package com.jihan.javastudycode.week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnotationEx3 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;
        System.out.println(nc.getOldField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass> list = new ArrayList();
        list.add(nc);

    }
}

