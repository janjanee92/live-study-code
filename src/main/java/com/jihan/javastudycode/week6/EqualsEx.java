package com.jihan.javastudycode.week6;

public class EqualsEx {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(1);

        System.out.println(p1.equals(p2));
    }
}

class Person{
    long id;

    Person(long id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person)
            return id == ((Person)o).id;
        else
            return false;
    }

}