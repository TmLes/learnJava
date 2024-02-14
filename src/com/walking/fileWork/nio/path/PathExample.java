package com.walking.fileWork.nio.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

  public static void main(String[] args) {
    /*
     * Paths.get() можно и нужно заменить на Paths.of()
     */
    Path path1 = Paths.get("resourses/newFolder/word.txt");
    System.out.println(path1.toString());

    String parentDirectory = Paths.get("resourses/newFolder").toString();
    String fileName = "word.txt";
    Path path2 = Paths.get(parentDirectory, fileName);
    System.out.println(path2.toString());

    Path path3 = Paths.get("resourses", "newFolder", "words.txt");
    System.out.println(path3.toString());

    Path path4 = path3.toAbsolutePath();
    System.out.println(path4.toString());

    Path path5 = Paths.get("D:\\src\\");
    try (var stream = Files.list(path5)) {
      stream.forEach(file -> System.out.println("File - " + file));
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
