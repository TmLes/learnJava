package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

  public static void main(String[] args) {
    LocalDateTime date = LocalDateTime.now();
    date = date.plusWeeks(ThreadLocalRandom.current().nextInt(10, 100));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
      "dd-MM-yyyy HH:mm"
    );
    String time = date.format(formatter);
    LocalDateTime newDate = LocalDateTime.parse(time, formatter);
    System.out.println(newDate);
  }
}
