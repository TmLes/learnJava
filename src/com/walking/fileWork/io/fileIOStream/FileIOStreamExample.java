package com.walking.fileWork.io.fileIOStream;
/*
 * Одна из реализаций InputStream
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIOStreamExample {

  public static void main(String[] args) {
    File file = new File("resourses/test.txt");

    try (FileInputStream fis = new FileInputStream(file)) {
        byte[] array = fis.readAllBytes();
        for (byte b : array) {
            System.out.print((char)b);
            System.out.println();

        }
    } catch (
      IOException e
    ) {
      System.out.println(e.getMessage());
    }

  }
}
