package com.jihan.javastudycode.lang;

public class BookStore implements Cloneable {
    private Book book;
    private String name;

    public BookStore(Book book, String name) {
        this.book = book;
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookStore shallowCopy() {
        Object obj = null;
        try {
            obj =  super.clone();
        } catch (CloneNotSupportedException e) {}
        return (BookStore) obj;
    }

    public BookStore deepCopy() {
        Object obj = null;
        try {
            obj =  super.clone();
        } catch (CloneNotSupportedException e) {}
        BookStore bs = (BookStore) obj;
        bs.setBook(new Book(this.book.getName(), this.book.getPrice()));
        return bs;
    }


    @Override
    public String toString() {
        return "BookStore{" +
                "book=" + book +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        BookStore bs1 = new BookStore(new Book("JPA BOOK", 10000), "교보문고");
        BookStore bs2 = bs1.deepCopy();

        // clone한 BookStore의 BOOK 이름을 JPA BOOK -> SPRING BOOK 변경
        bs2.getBook().setName("SPRING BOOK");

        System.out.println(bs1);
        System.out.println(bs2);
    }
}
