package com.walking.lesson32.task.task1;


import com.walking.lesson32.task.task1.model.Car;
import com.walking.lesson32.task.task1.service.CarServise;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "white");
        Car volga = new Car("Volga", "black");
        Car vaz = new Car("Vaz", "green");
        Car uaz = new Car("Uaz", "brown");
        Car niva = new Car("Niva", "red");

        CarServise.INSTANCE.put(lada);
        CarServise.INSTANCE.put(volga);
        CarServise.INSTANCE.put(vaz);
        CarServise.INSTANCE.put(uaz);
        CarServise.INSTANCE.put(niva);

        CarServise.INSTANCE.save();

    }
}
