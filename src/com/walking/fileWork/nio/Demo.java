package com.walking.fileWork.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Более современное API для работы с файлами
 */

public class Demo {

  public static void main(String[] args) {
    showDemoPath();
  }

  /**
 *  Демонстрация работы с путями и файлами в NIO API
 */
private static void showDemoPath() {
    Path path = Paths.get("resourses");  // создаем путь

    System.out.println(path.toString());  // текстовый вариант пути

    System.out.println(path.isAbsolute());  // является ли абсолютным

    System.out.println(path.getFileName());  // имя файла

    System.out.println(path.getParent());  // имя родителя

    System.out.println(path.getName(0));  // имя в пути по индексу

    System.out.println(path.getNameCount());  // количество имен в пути

    System.out.println(Files.exists(path));  // существует ли

    System.out.println(Files.isRegularFile(path));  // нормальный ли (не символический)

    System.out.println(Files.isReadable(path));  // читаемый ли

    try {  // размер файла
        System.out.println(Files.size(path));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try {  // время последней модификации
        System.out.println(Files.getLastModifiedTime(path).toMillis());
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(path)) {  // список файлов
        for (Path child : dirStream) {
            System.out.println(child);
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    Path newPath = Paths.get("resources/util");  // создать директорию
    try {
        Files.createDirectory(newPath);
        System.out.println("Directory has been created");
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    Path newFile = Paths.get("resources/util/test.txt");  // создать файл
    try {
        Files.createFile(newFile);
        System.out.println("File has been created");
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    Path newPlace = Paths.get("resources/test.txt");  // копировать файл (move() - переместить)
    try {
        Files.copy(newFile, newPlace);
        System.out.println("File has been copy");
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try {  // удалить файл
        Files.delete(newFile);
        System.out.println("File has been deleted");
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
  }
}
