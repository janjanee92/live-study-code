package com.jihan.javastudycode.week15;

@FunctionalInterface
interface MyFunction3 {
    void myMethod();
}

class Outer {
    int val = 10;

    class Inner {
        int val = 20;

        void method(final int i) {    // void method(final int i)
            final int val = 30;   // final int val = 30;
//            i = 10;       // ERROR. 상수의 값은 변경할 수 없다.

            MyFunction3 f = () -> {
                System.out.println("             i : " + i);
                System.out.println("           val : " + val);
                System.out.println("      this.val : " + ++this.val);
                System.out.println("Outer.this.val : " + ++Outer.this.val);
            };

            f.myMethod();
        }
    } // End Of Inner
}   // End Of Outer

public class LambdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}
