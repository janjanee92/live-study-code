package com.jihan.javastudycode.week12;

import java.lang.annotation.Annotation;

@Deprecated
@SuppressWarnings("11111")
@TestInfo
public class AnnotationEx5 {

    public static void main(String[] args) {
        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);

        for (String str : anno.testTools()) {
            System.out.println("testTools= " + str);
        }

        System.out.println();

        Annotation[] annoArr = cls.getAnnotations();

        for (Annotation annotation : annoArr) {
            System.out.println(annotation);
        }
    }
}
