package com.walking.lesson4.task.task2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter your name, please: ");
        var name = scanner.nextLine();
        switch (name.toLowerCase()) {
            case "admin" -> System.out.println("Hello!");
            case "dimon" -> System.out.println("Greetings");
            default -> System.out.println("Go outside!");
        }
    }
}
