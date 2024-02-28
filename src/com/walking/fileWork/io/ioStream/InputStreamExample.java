package com.walking.fileWork.io.ioStream;
/*
 * Класс для чтения байт.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
    File file = new File("resources/test.txt");

    readByte(file);
    readAllbyte(file);
  }

    /**
     * Метод читает файл побайтно
     * @param file путь к файлу
     */
    private static void readByte(File file) {
        try (InputStream stream = new FileInputStream(file)) {
            int data;
            while ((data = stream.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метот считывает сразу все байты
     * @param file путь к файлу
     */
    private static void readAllbyte(File file) {
        try (InputStream stream = new FileInputStream(file)) {
            byte[] array = stream.readAllBytes();
            StringBuilder builder = new StringBuilder();
            for (byte b : array) {
                builder.append((char) b);
            }
            System.out.println(builder.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
