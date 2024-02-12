package com.walking.lesson15.task;

public class Dog implements BeAnimal {
    @Override
    public void sound() {
        System.out.println("Woof-woof!");
    }

    @Override
    public void doEat() {
        System.out.println("I go to eat meat!");
    }
}
