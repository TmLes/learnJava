package com.vtb.oop;

import com.vtb.oop.animals.Animal;
import com.vtb.oop.animals.Cat;
import com.vtb.oop.animals.Dog;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Cat masya = new Cat("Mars", "grey", 4);
        Dog gerda = new Dog("Gerda", "black", 5);

        ArrayList<Animal> beasts = new ArrayList<>();
        beasts.add(masya);
        beasts.add(gerda);
        beasts.forEach(Animal::voice);

        System.out.println(masya);
    }
}
