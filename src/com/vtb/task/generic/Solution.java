package com.vtb.task.generic;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Fruit {
    float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(1f);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit> {
    ArrayList<T> capacity;
    int count;

    public Box() {
        this.capacity = new ArrayList<>();
    }

    void put(T t) {
        capacity.add(t);
        count += 1;
    }

    public float getWeight() {
        return count * capacity.get(0).weight;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void copyTo(Box<T> another) {
        if (this.getClass() == another.getClass()) {
            another.capacity.addAll(this.capacity);
            this.capacity.clear();
        } else {
            throw new IllegalArgumentException("Нельзя копировать содержимое коробки с " + this.capacity.get(0).getClass().getSimpleName() + " в коробку с " + another.capacity.get(0).getClass().getSimpleName());
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        for (int i = 0; i < 10; i++) {
            box1.put(new Apple());
            box2.put(new Orange());
        }
        System.out.println("Apple box = " + box1.getWeight() + ".\nOrange box = " + box2.getWeight());
        System.out.println(box1.compare(box2));
    }

    public static <T> void changeTwoElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <E> ArrayList<E> arrayToList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}

