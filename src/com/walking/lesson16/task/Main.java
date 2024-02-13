//package com.walking.lesson16.task;
//
//import com.walking.lesson16.task.model.Car;
//import com.walking.lesson16.task.model.CarService;
//import java.util.Scanner;
//
//public class Main {
//
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    Car myCar = new Car("Mercedes", "A648PM_13");
//    Car myCar1 = new Car("Mercedes", "A646PM_13");
//    Car myCar2 = new Car("Toyota", "A646PM_13");
//    Car myCar3 = new Car("BMW", "A758TM_13");
//
//    CarService.INSTANCE.put(myCar);
//    CarService.INSTANCE.put(myCar1);
//    CarService.INSTANCE.put(myCar2);
//    CarService.INSTANCE.put(myCar3);
//
//    System.out.println("Enter the name ");
//    String name = scanner.nextLine();
//    System.out.println("Enter the number");
//    String number = scanner.nextLine();
//
//    Car inputCar = new Car(name, number);
//    CarService.INSTANCE.find(inputCar);
//  }
//}
