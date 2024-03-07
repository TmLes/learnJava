package com.walking.fuctionalProg.funcInterface.consumer;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/*
* public interface Consumer<T> {
*   void accept(T t);
* }
* Используется для описания операций над объектом без возврата результата
* опирается на побочные действия при выполнении операции
* Побочные действия:
*   1. Читать и изменять значения глоб. переменных и полей класса
*   2. Операции ввода-вывода
*   3. Реагировать на исключения, вызывать их обработчики
* */
public class ConsumerExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = random.ints().limit(10).boxed().toList();
        Consumer<Integer> cons1 = x -> System.out.println(x + "A");
        numbers.forEach(cons1);


    }
}
