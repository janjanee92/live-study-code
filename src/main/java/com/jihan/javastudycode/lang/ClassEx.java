package com.jihan.javastudycode.lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassEx {
    public static void main(String[] args) throws Exception {

        Class<Book> bookClass = Book.class;
        Book book = new Book("SPRING BOOK", 10000);
        Class<? extends Book> bookClass2 = book.getClass();
        Class<?> bookClass3 = Class.forName("com.jihan.javastudycode.lang.Book");

        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            try {
                f.setAccessible(true);  //  true로 지정해야 private 접근가능
                System.out.printf("%s %s \n", f, f.get(book));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        Arrays.stream(bookClass.getDeclaredMethods()).forEach(System.out::println);

        System.out.println(bookClass.getSuperclass());

        Arrays.stream(bookClass.getInterfaces()).forEach(System.out::println);

        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            int modifiers = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
        });

        Constructor<Book> constructor = bookClass.getConstructor(String.class, int.class);
        Book theLordOfTheRings = constructor.newInstance("반지의 제왕", 20000);

    }
}
