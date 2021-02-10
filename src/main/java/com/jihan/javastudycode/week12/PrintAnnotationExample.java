package com.jihan.javastudycode.week12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for (Method method : declaredMethods) {

            if (method.isAnnotationPresent(PrintAnnotation.class)) {

                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                System.out.println("[" + method.getName() + "]");

                for (int i = 0; i < printAnnotation.number(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                method.invoke(new Service());
                System.out.println();
            }

        }
    }
}
