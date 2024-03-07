package com.walking.fuctionalProg.funcInterface.compare.simpleExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Mover> base = new ArrayList<>();

        base.add(new Mover("Evgeny", 40_000));
        base.add(new Mover("Dmitry", 60_000));
        base.add(new Mover("Sergey", 45_000));
        base.add(new Mover("Oleg", 45_000));
        base.add(new Mover("Vladimir", 40_000));

        System.out.println("Before sorting:\n" + base);
        Collections.sort(base);
        System.out.println("After sorting from name:\n" + base);


        /*
         * Comparator нужен для сортировки ненатуральным порядком
         */
        base.sort(Comparator.comparingInt(Mover::getSalary));
        System.out.println("After sorting from salary:\n" + base);

        base.sort(Comparator.comparingInt(Mover::getSalary).thenComparing(Mover::getName));
        System.out.println("After sorting from salary and name:\n" + base);
    }
}
