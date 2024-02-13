package com.vtb.task.oop.Animal;

public abstract class Animal extends Beast {
    public static int countAnimal;

    public Animal(String name, int age) {
        super(name, age);
        countAnimal += 1;
    }

    public Animal() {
        countAnimal += 1;
    }

    public abstract void run(int length);

    @Override
    public abstract void swim(int length);

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}