package com.walking.lesson17.task;

/*
Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.

Реализуйте класс «Файл» содержит название файла, его размер и тип информации
(Текст, изображение, аудио, видео. Рекомендую задать типы информации через Enum).

Реализуйте механизм поиска по файлам. Метод, реализующий поиск должен выбрасывать
FileNotFoundException, если файл не найден (вне зависимости от варианта задачи).
Если файл с названием, введенным пользователем с клавиатуры, существует – вывести на экран информацию о нем
 (допустимо использовать переопределенный toString()). Если нет, то

Вариант 1: выведите сообщение «Искомый файл не существует»;

Вариант 2: выбросьте исключение FileNotFoundException. Подсказка: throws можно использовать в том
числе в main().
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      List<MyFile> myFileList = new ArrayList<>();
      myFileList.add(new MyFile("kids", 13, DataTypes.JPG));
      myFileList.add(new MyFile("fish", 25, DataTypes.AVI));
      myFileList.add(new MyFile("form", 4, DataTypes.TXT));
      myFileList.add(new MyFile("love", 8, DataTypes.MP3));

      System.out.println("Enter file name");
      String name = scanner.nextLine();
      try {
        search(myFileList, name);
      } catch (FileNotFoundException e) {
        System.out.println("File is not found");
      }
    }
  }

  public static void search(List<MyFile> fileList, String name)
    throws FileNotFoundException {
    for (MyFile mF : fileList) {
      if (mF.name.equals(name)) {
        System.out.println(mF);
      } else throw new FileNotFoundException();
    }
  }
}
