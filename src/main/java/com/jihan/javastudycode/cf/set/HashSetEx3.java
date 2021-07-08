package com.jihan.javastudycode.cf.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEx3 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person("Lee", 20));
        set.add(new Person("Lee", 20));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person tmp = (Person) o;
            return name.equals(tmp.name) && age == tmp.age;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

}
