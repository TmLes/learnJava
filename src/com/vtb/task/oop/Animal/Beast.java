package com.vtb.task.oop.Animal;

public abstract class Beast {
    String name;
    int age;
    public static int countBeast;

    public Beast(String name, int age) {
        this.name = name;
        this.age = age;
        countBeast +=1;
    }

    public Beast() {
        countBeast +=1;
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Beast another)) {
            return false;
        }
        return this.name.equals(another.name) && this.age == another.age;
    }

    @Override
    public String toString() {
        return "My name is " + name + " And I am " + age + " years old";
    }
}
