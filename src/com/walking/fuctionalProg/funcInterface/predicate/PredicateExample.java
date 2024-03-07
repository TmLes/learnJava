package com.walking.fuctionalProg.funcInterface.predicate;

/*
public interface Predicate<T> {
    boolean test(T t);
}

* Predicate используется когда нужно проверить какое-либо условие
* Оснавная область применения- фильтрация данных
* */


import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        final String line = "-".repeat(50);
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 100);
        
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(randomNumber + " " + isEven.test(randomNumber));

        List<Cat> cats = Cat.getListCat(10);
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println(line);

        cats.removeIf(x -> x.getAge() < 5);

        System.out.println(cats);

        System.out.println(line);

        cats.removeIf(PredicateExample::removeLongName);
        System.out.println(cats);

        Predicate<Cat> pred1 = x -> x.getAge() < 4;
        cats.removeIf(pred1.and(x -> x.getName().length() > 3));


    }

    private static boolean removeLongName(Cat cat) {
        return cat.getName().length() > 5;
    }

}
