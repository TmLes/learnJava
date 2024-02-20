package com.walking.interfaceExample.funcInterface.compare.hardExample.Car;
import java.time.LocalDateTime;

import com.walking.interfaceExample.funcInterface.compare.hardExample.Entity.CarColor;
import com.walking.interfaceExample.funcInterface.compare.hardExample.Entity.Model;
import com.walking.interfaceExample.funcInterface.compare.hardExample.Entity.ProductDate;
import com.walking.interfaceExample.funcInterface.compare.hardExample.Entity.RandomPrice;


public class Car implements Comparable<Car> {
    private final String model;
    private final String color;
    private final int price;
    private final LocalDateTime date;

    public Car() {
        this.model = Model.getRandomModel().getModelName();
        this.color = CarColor.getRandomCarColor().getColorName();
        this.price = RandomPrice.getRandomPrice();
        this.date = ProductDate.getProductDate();
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public int compareTo(Car o) {
        int compareName = this.model.compareTo(o.model);
        if (compareName != 0 ) return compareName;

        int compareColor = this.color.compareTo(o.color);
        if (compareColor != 0 ) return compareName;

        // int comparePrice = Integer.compare(this.price, o.price);
        int comparePrice = this.price - o.price;
        if (comparePrice != 0) return comparePrice;

        return this.date.compareTo(o.date);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
