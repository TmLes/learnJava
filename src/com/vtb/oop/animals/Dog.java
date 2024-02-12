package com.vtb.oop.animals;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " woof!");
    }
}
