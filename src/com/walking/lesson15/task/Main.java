package com.walking.lesson15.task;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BeAnimal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        for (BeAnimal arg : animals) {
            if (arg instanceof Dog dog) {
                dog.doEat();
            }
        }

        for (BeAnimal arg : animals) {
            if (arg.getClass().equals(Cat.class)) {
                arg.sound();
            }
        }


    }
}
