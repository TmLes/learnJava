package com.vtb.oop.animals;


public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " meow!");
    }

    @Override
    public int hashCode() {
        return name.length() * 12 + color.length() * 5 - age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat another = (Cat) obj;
        return this.name.equals(another.name) && this.color.equals(another.color) && this.age == another.age;
    }

    @Override
    public String toString() {
        return "Cat [" + name + ", " + age + ", " + color + "]";
    }
}
