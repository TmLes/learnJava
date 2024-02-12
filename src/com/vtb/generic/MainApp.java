package com.vtb.generic;

public class MainApp {
    public static void main(String[] args) {
        GenBox<Integer> num1 = new GenBox<>(10);
        GenBox<Integer> num2 = new GenBox<>(30);
        GenBox<String> name = new GenBox<>("John");

        System.out.println(num1.getObj() + num2.getObj());

        GenNumberBox<Integer> b1 = new GenNumberBox<>(1, 2, 3, 5);
        GenNumberBox<Double> b2 = new GenNumberBox<>(1.0, 2.3);


        System.out.println(b1.average());
        System.out.println(b2.average());

        System.out.println(b1.CompareGenNumberBox(b2));
    }
}
