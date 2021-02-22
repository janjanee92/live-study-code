package com.jihan.javastudycode.week14;

public class FruitBoxEx2 {

    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
//        FruitBox<Toy> toyBox = new FruitBox<Toy>();     // ERROR.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Grape());  // ERROR.
        grapeBox.add(new Grape());

        System.out.println("fruit-box - " + fruitBox);
        System.out.println("apple-box - " + appleBox);
        System.out.println("grape-box - " + grapeBox);
    }

}
