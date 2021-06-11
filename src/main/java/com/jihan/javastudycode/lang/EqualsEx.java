package com.jihan.javastudycode.lang;

import java.util.Objects;

public class EqualsEx {
    public static void main(String[] args) {
        Member m1 = new Member(30);
        Member m2 = new Member(30);

        if (m1 == m2)
            System.out.println("m1과 m2는 같다.");
        else
            System.out.println("m1과 m2는 다르다.");

        if (m1.equals(m2))
            System.out.println("m1과 m2는 같다.");
        else
            System.out.println("m1과 m2는 다르다.");

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
    }
}
class Member {
    String name;
    int age;

    Member(int age) {
        this.age = age;
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
