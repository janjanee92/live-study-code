package com.jihan.javastudycode.week15;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {
//        Function<String, Integer> f = s -> Integer.parseInt(s);
        Function<String, Integer> f = Integer::parseInt;

        System.out.println(f.apply("100") + 200);

        // Supplier 입력 X, 출력 O
//        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s = MyClass::new;
        System.out.println(s.get());

        Function<Integer, MyClass> f2 = MyClass::new;
        MyClass m = f2.apply(100);
        System.out.println(m.iv);
        System.out.println(f2.apply(200).iv);

        Function<Integer, int[]> f3 = int[]::new;
        System.out.println(f3.apply(10).length);

    }
}

class MyClass {
    int iv;

    MyClass () {}

    MyClass (int iv) {
        this.iv = iv;
    }
}
