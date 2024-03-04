package com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
    Класс для работы с рандомными числами
 */
public class RandomNumber {

    public static List<Integer> getListRandomInt(int size) {
        List<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(getRandomInt());
        }
        return numbers;
    }

    public static int getRandomInt() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }
}
