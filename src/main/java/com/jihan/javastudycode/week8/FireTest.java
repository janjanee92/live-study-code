package com.jihan.javastudycode.week8;

public class FireTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("f는 Unit의 자손");
        if (f instanceof Fightable)
            System.out.println("f는 Fightable 구현");
        if (f instanceof Movable)
            System.out.println("f는 Movable 구현");
        if (f instanceof Attackable)
            System.out.println("f는 Attackable 구현");
    }
}

class Fighter extends Unit implements Fightable {

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable { }

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}
