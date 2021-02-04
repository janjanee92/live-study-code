package com.jihan.javastudycode.week11;

public abstract class Color extends MyEnum {
    static final Color RED = new Color("RED") {
        @Override
        void print() {
            System.out.println("RED IS HOT!");
        }
    };
    static final Color BLUE = new Color("BLUE") {
        @Override
        void print() {
            System.out.println("BLUE IS COOL~");
        }
    };
    static final Color GREEN = new Color("GREEN") {
        @Override
        void print() {
            System.out.println("GREEN IS FRESH.");
        }
    };

    Color(String name) {
        super(name);
    }

    public String name() {
        return name;
    }

    abstract void print();
}
