package com.walking.fileWork.nio.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilesExample {

  public static void main(String[] args) {
    Path path = Path.of("resources/test.txt");
    Path path1 = Path.of("resourses");

    // проход по содержимому файла
    try (Stream<String> lines = Files.lines(Path.of("resources/test.txt"))) {
        lines.forEach(System.out::println);
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    // проход по названиям файлов
    try (var stream = Files.list(path)) {
        stream.forEach(fileName -> System.out.println("File - " + fileName));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try (var stream = Files.walk(path1)) {
        stream.forEach(fileName -> System.out.println("File - " + fileName));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try {
        byte[] array = Files.readAllBytes(Path.of("resources/test.txt"));
        for (byte b : array) {
            System.out.println((char) b);
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try {
        List<String> line = Files.readAllLines(path);
        for (String  lines : line) {
            System.out.println(lines);
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
  }
}
