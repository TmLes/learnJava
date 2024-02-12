//package com.walking.lesson16.task.model;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public enum CarService {
//    INSTANCE;
//
//    private final Map<String, Car> base;
//
//    CarService() {
//        base = new HashMap<>();
//    }
//
//    public Map<String, Car> getBase() {
//        return base;
//    }
//
//    public void put(com.walking.lesson32.task.task1.model.Car lada) {
//        base.put(lada.getName(), lada);
//    }
//
//    public void find(Car car) {
//        Car foundCar = base.get(car.getName());
//        if (foundCar != null && foundCar.equals(car)) {
//            System.out.println("Car is found: " + foundCar.getName() + " " + foundCar.getNumber());
//        } else {
//            System.out.println("Car is not found!");
//        }
//    }
//}
