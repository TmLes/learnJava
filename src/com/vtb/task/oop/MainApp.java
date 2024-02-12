package com.vtb.task.oop;

import com.vtb.task.oop.Animal.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Beast> beasts = new ArrayList<>(Arrays.asList(new Cat("Mars", 5),
                                                                new Cat("Masya", 12),
                                                                new Dog("Gerda", 6),
                                                                new Duck("Krakva", 1)));

        int length = random.nextInt(101);
        beasts.forEach(x -> x.run(length));

        int newLength = random.nextInt(101);
        beasts.forEach(x -> x.swim(newLength));


        System.out.println("Created " + Cat.countCat + " cats.");
        System.out.println("Created " + Dog.countDog + " dogs.");
        System.out.println("Created " + Duck.countDuck + " ducks.");
        System.out.println("Created " + Animal.countAnimal + " animals.");
        System.out.println("Created " + Birds.countBirds + " birds.");
        System.out.println("Created " + Beast.countBeast + " beasts.");

    }

}
