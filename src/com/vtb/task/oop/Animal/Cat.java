package com.vtb.task.oop.Animal;

public class Cat extends Animal {
    public static int countCat;
    int capacity = 50;

    public Cat(String name, int age) {
        super(name, age);
        countCat += 1;
    }

    public Cat() {
        countCat += 1;
    }

    @Override
    public void run(int length) {
        if (length <= this.capacity) {
            System.out.println(this.name + " runs " + length + "m.");
        } else {
            System.out.println(this.name + " can run only " + (length - this.capacity) + "m and it is tired!");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(this.name + " is a cat and it is can`t swim!");
    }

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
