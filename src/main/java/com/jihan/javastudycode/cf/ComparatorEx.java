package com.jihan.javastudycode.cf;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"jpa", "spring", "java", "csharp", "Nodejs"};

        Arrays.sort(strArr);    //  String Comparable 구현에 의한 정렬
        print(strArr);

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        print(strArr);

        Arrays.sort(strArr, new Descending());
        print(strArr);

    }

    private static void print(String[] strArr) {
        System.out.println("strArr=" + Arrays.toString(strArr));
    }

}

class Descending implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

