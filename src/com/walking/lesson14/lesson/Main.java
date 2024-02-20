package com.walking.lesson14.lesson;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String current = scanner.nextLine().toUpperCase();
            Day day = Day.valueOf(current);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                    System.out.println("Go to work");
                case SATURDAY, SUNDAY:
                    System.out.println("Go to relax");
                default:
                    System.out.println("Drink beer");
            }
        }
        Animal mars = new Animal("Mars", Color.GREY);
        Animal gerda = new Animal("Gerda", Color.BLACK);

        List<Day> days = List.of(Day.values());
        days.forEach(System.out::println);

        System.out.println(Day.MONDAY.ordinal());

        System.out.println(mars.color.getId());
        System.out.println(gerda.color.getId());
        System.out.println(Color.WHITE.getId());

        System.out.println(Operation.SUM.action(10, 5));
        System.out.println(Operation.SUBTRACT.action(10, 5));
        System.out.println(Operation.MULTIPLY.action(10, 5));

    }
}
