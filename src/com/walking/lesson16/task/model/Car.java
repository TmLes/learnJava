package com.walking.lesson16.task.model;

import java.util.Objects;


public class Car {
    private final String name;
    private final String number;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Car(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getName(), car.getName()) && Objects.equals(getNumber(), car.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }
}
