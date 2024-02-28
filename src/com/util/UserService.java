package com.util;

/*
  Класс для работы с английскими именами и фамилиями
  */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UserService {

    private static final String NAMES_FILE_PATH = "resources/util/names.txt";
    private static final String SURNAMES_FILE_PATH = "resources/util/surnames.txt";

    private static List<String> names;
    private static List<String> surnames;

    static {
        try {
            names = Files.readAllLines(Paths.get(NAMES_FILE_PATH));
            surnames = Files.readAllLines(Paths.get(SURNAMES_FILE_PATH));
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }

    /**
     * @param list список с данными
     * @return элемент из списка по случайному индексу
     */
    private static String getRandomElement(List<String> list) {
        return list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
    }

    /**
     * @return элемент из списка имен
     */
    public static String getRandomName() {
        return getRandomElement(names);
    }

    /**
     * @return элемент из списка фамилий
     */
    public static String getRandomSurname() {
        return getRandomElement(surnames);
    }

    /**
     * @return строка с полным именем
     */
    public static String getFullName() {
        return getRandomName() + " " + getRandomSurname();
    }
}

