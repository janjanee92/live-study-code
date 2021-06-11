package com.jihan.javastudycode.lang;

public class CloneEx extends ToStringEx{
    public static void main(String[] args) {
        Book book = new Book("JPA Book", 5);
        Book copy = book.clone();
        System.out.println(book);
        System.out.println(copy);
    }
}
