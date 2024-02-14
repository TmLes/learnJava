package com.walking.lesson32.task.task1.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.walking.lesson32.task.task1.model.Car;

public enum CarServise {
    INSTANCE;

    private final ArrayList<Car> base;

    CarServise() {
        base = new ArrayList<>();
    }

    public ArrayList<Car> getBase() {
        return base;
    }

    public void put(Car car) {
        base.add(car);
    }

    public void save() {
        File file = new File("resourses/carCatalog.txt");
        try (FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(base);
            System.out.println("Base is save!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
