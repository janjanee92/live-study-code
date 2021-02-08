package com.jihan.javastudycode.week12;

import java.lang.annotation.Annotation;

@MyAnnotation
@TestInfo()
class NewClass {
    int newField;

    int getNewField() { return newField; }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() { return oldField;}

}

public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        Annotation[] annotations = NewClass.class.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println("toString(): " + annotation.toString());
            System.out.println("hashCode(): " + annotation.hashCode());
            System.out.println("equals(): " + annotation.equals(annotation));
            System.out.println("annotationType(): " + annotation.annotationType());

            System.out.println();
        }
    }
}
