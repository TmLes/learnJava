package com.walking.fileWork.io.file;

/*
 * класс File управляет информацией о файлах и каталогах
 */

import java.io.File;
import java.io.IOException;

public class FileExample {

  public static void main(String[] args) {
    /*Создаем переменную с каким-либо путем */
    File dir = new File("resourses");

    showFile(dir);
    showDemoDir();
    showDemoFiles();
  }

  /**
   * Программа выводит список файлов
   * @param dir адрес поиска
   */
  private static void showFile(File dir) {
    if (dir.isDirectory()) { // если каталог
      for (File file : dir.listFiles()) { // проходим по списку файлов
        if (file.isDirectory()) { // если каталог пишем имя файла и каталог если файл то имя файла и файл
          System.out.println(file.getName() + " is directory.");
        } else {
          System.out.println(file.getName() + " is file");
        }
      }
    }
  }

  /**
   * Демонстрация создания, переименование, и удаление каталогов
   */
  private static void showDemoDir() {
    File folder = new File("resourses/newDir");

    boolean created = folder.mkdir(); // Создаем новый каталог
    if (created) {
      System.out.println("Folder has been created");
    }

    File newFolder = new File("resourses/renameDir"); // Меняем имя каталога
    folder.renameTo(newFolder);

    boolean deleted = newFolder.delete(); // удаляем каталог
    if (deleted) {
      System.out.println("Folder has been deleted");
    }
  }

  /**
 * Демонстрация создания, переименование, и удаление файлов
 */
private static void showDemoFiles() {
    File file = new File("resources/test.txt"); // создаем файл (если не существует)
    try {
      boolean created = file.createNewFile();
      if (created) {
        System.out.println("File has been created");
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("File name = " + file.getName()); // имя файла

    System.out.println("Parent folder = " + file.getParent()); // имя родителя

    if (file.exists()) { // сужествует ли файл
      System.out.println("File exist");
    } else {
      System.out.println("File not found");
    }

    System.out.println("File size = " + file.length()); // размер файла

    if (file.canRead()) { // можно читать
      System.out.println("File can be read");
    } else {
      System.out.println("File can\\`t be read");
    }

    if (file.canWrite()) { // можно записывать
      System.out.println("File can be written");
    } else {
      System.out.println("File can\\`t be written");
    }

    boolean deleted = file.delete(); // удаление
    if (deleted) {
      System.out.println("File has been deleted");
    }
  }
}
