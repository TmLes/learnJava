package com.walking.interfaceExample.funcInterface.compare.hardExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.walking.interfaceExample.funcInterface.compare.hardExample.Car.Car;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(new Car());
        }

        for(Car car : arr) {
            System.out.println(car);
        }
        System.out.println("-------------------------------");


        Collections.sort(arr);
        for(Car car : arr) {
            System.out.println(car);
        }
        System.out.println("-------------------------------");

        arr.sort(Comparator.comparingInt(Car::getPrice));
        for(Car car : arr) {
            System.out.println(car);
        }
        System.out.println("-------------------------------");
    }
}
