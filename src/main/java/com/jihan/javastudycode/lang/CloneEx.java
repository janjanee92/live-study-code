package com.jihan.javastudycode.lang;

public class CloneEx extends ToStringEx{
    public static void main(String[] args) {
        Book book = new Book("JPA Book", 5);
        Book copy = book.clone();
        System.out.println(book);
        System.out.println(copy);
    }
}

class Book implements Cloneable {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Book clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return (Book)obj;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
