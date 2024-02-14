package com.walking.time.LocalDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();  // время сейчас
        LocalDateTime nowTime = LocalDateTime.of(2024,Month.FEBRUARY, 14, 9, 50, 00);  // время из строки

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  // форматер для времени
        String formattedData = ldt.format(formatter);

        System.out.println(ldt);  // 2024-02-14T09:37:52.938160800
        System.out.println(nowTime);  // 2024-02-14T09:50
        System.out.println(formattedData);  // 2024-02-14T09:50

        System.out.println(nowTime.isAfter(ldt));  // true если до
        System.out.println(nowTime.isBefore(ldt));  // true если после
    }
}
