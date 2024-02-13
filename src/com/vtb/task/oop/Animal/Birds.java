package com.vtb.task.oop.Animal;

public abstract class Birds extends Beast {
    public static int countBirds;

    public Birds(String name, int age) {
        super(name, age);
        countBirds += 1;
    }

    public Birds() {
        countBirds += 1;
    }

    @Override
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
