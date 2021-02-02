package com.jihan.javastudycode.test;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;

        lv = 10;
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // int liv3 = lv;   // Compile Error
            int liv4 = LV;
        }
    }
}