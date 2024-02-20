package com.walking.interfaceExample.funcInterface.compare.hardExample.Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class ProductDate {

  public static LocalDateTime getProductDate() {
    LocalDateTime date = LocalDateTime.now();
    date = date.plusWeeks(ThreadLocalRandom.current().nextInt(10, 100));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
      "dd-MM-yyyy HH:mm"
    );
    String time = date.format(formatter);
    LocalDateTime newDate = LocalDateTime.parse(time, formatter);
    return newDate;
  }
}
