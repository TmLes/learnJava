package com.walking.fuctionalProg.streamApi.create;

import com.util.RandomName;
import com.util.RandomNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateExample {
    public static void main(String[] args) {
//        demoListToNumberStream();
//        demoMapToStream();
//        demoArrayToStream();
//        demoMoreCreationStream();
//        demoBufferedReaderToStream();
//        demoRideFileToStream();
        randomNumberToStream();
    }

    /**
     * Создания потока примитивов
     */
    private static void demoListToNumberStream() {
        List<Integer> numbers = RandomNumber.getListRandomInt(10);

        // Stream int из коллекции
        numbers.stream().mapToInt(value -> value).forEach(System.out::println);
        // паралельный Stream double из коллекции
        numbers.parallelStream().mapToDouble(value -> value).forEach(System.out::println);
        // паралельный Stream long из коллекции
        numbers.parallelStream().mapToLong(value -> value).forEach(System.out::println);
    }

    /**
     * Поток из Map
     */
    private static void demoMapToStream() {
        Map<String, Integer> people = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            people.put(RandomName.getRandomName().trim(), RandomNumber.getRandomInt());
        }
        // поток ключ:значение
        people.entrySet().stream().forEach(System.out::println);
        // поток значений
        people.values().stream().forEach(System.out::println);
    }

    /**
     * поток из массива
     */
    private static void demoArrayToStream() {
        int[] arg = new int[10];
        for (int i = 0; i < arg.length; i++) {
            arg[i] = RandomNumber.getRandomInt();
        }
        Arrays.stream(arg).forEach(System.out::println);
    }

    /**
     * Stream из элементов, используя статические методы Классов-потоков
     */
    private static void demoMoreCreationStream() {
        // поток из елементов
        var charStream = Stream.of('a', 'b', 'c');
        //поток из массива
        int[] arg = {1, 2, 3, 4, 5};
        Stream<int[]> intStream = Stream.of(arg);
        // поток из листа
        List<Integer> list = new ArrayList<>();
        var listStream = Stream.of(list);
        // поток из метода (без limit() безконечен)
        var randomStream = Stream.generate(RandomNumber::getRandomInt).limit(3);
        randomStream.forEach(System.out::println);
        // объединение потоков
        var concatStream = Stream.concat(charStream, intStream);
        // потоки int или long (не double) в диапазоне исключая посл.цифру и включая ее
        var rangeLongStream = LongStream.range(1, 10);
        var rangeIntStream = IntStream.rangeClosed(1, 10);
    }

    /**
     * Поток входящих данных с консоли
     */
    private static void demoBufferedReaderToStream() {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        // создаем поток
        var readerStream = reader.lines();
        // элементы потока попадают в лист пока элемент не будет равен exit
        var strings = readerStream.takeWhile(x -> !x.equals("exit")).toList();
        strings.forEach(System.out::println);

    }

    /**
     * поток из файла
     */
    private static void demoRideFileToStream() {
        Path path = Path.of("resources/util/words.txt");
        try (var words = Files.lines(path)) {
            var wordsList = words.
                    filter(x -> x.length() <= 4).
                    toList();
            wordsList.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void randomNumberToStream() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        random.longs().limit(10).forEach(System.out::println);
        random.doubles().limit(10).forEach(System.out::println);
    }
}
