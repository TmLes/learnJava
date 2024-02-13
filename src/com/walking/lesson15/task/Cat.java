package com.walking.lesson15.task;

public class Cat implements BeAnimal {
    @Override
    public void sound() {
        System.out.println("Meow-meow!");
    }

    @Override
    public void doEat() {
        System.out.println("I go to drink milk!");
    }
}
