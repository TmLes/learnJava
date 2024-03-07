package com.walking.fuctionalProg.optional;
/*
* Optional является оберткой для значений которая может безопасно содержат null
* Используется для уменьшения объемов кода и увеличении надежности при работе с null
* Применяется когда из метода возвращается ссылка которая может содержать null
* */

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Masy", 9);
        Cat cat2 = new Cat("Mars", 5);
        Cat cat3 = new Cat("Basyk", 6);

        Cat[] cats = {cat1, cat2, cat3};

        Cat findCat1 = findCatForName_1(cats, "Boris");  // return null
        System.out.println(findCat1);

        try {
            Cat findCat2 = findCatForName_2(cats, "Boris");  // return NoSuchElementException
            System.out.println(findCat2);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }


        Optional<Cat> findCat3 = findCatForName_3(cats, "Boris");
        if(findCat3.isPresent()) {
            Cat cat4 = findCat3.get();
            System.out.println(cat4.getName() + " is found");
        } else {
            System.out.println("Cat is not found");
        }

        if (findCat3.isPresent()) {
            String catName = findCat3.map(Cat::getName).orElse("Pussy");
            int age = findCat3.get().getAge();
            System.out.println(catName + age);
        } else {
            System.out.println("!");
        }
    }

    /**
     * Первый(ранний) способ поиска, если кот не найден возвращается null
     * @param cats массив котов
     * @param name имя для поиска
     * @return найденый кот
     */
    private static Cat findCatForName_1(Cat[] cats, String name) {
        for(Cat cat: cats) {
            if(cat.getName().equals(name)) {
                return cat;
            }
        }
        return null;
    }

    /**
     * Второй(ранний) способ поиска, если кот не найден, бросается исключение
     * @param cats массив котов
     * @param name имяя для поиска
     * @return найденый кот
     * @throws NoSuchElementException если кот не найден
     */
    private static Cat findCatForName_2(Cat[] cats, String name) throws NoSuchElementException {
        for(Cat cat : cats) {
            if(cat.getName().equals(name)) {
                return cat;
            }
        }
        throw new NoSuchElementException();
    }

    /**
     * @param cats массив котов
     * @param name имя для поиска
     * @return Optional содержащий или ссылку на найденый объект или null
     */
    private static Optional<Cat> findCatForName_3(Cat[] cats, String name) {
        Cat result = null;
        for(Cat cat : cats) {
            if(cat.getName().equals(name)) {
                result = cat;
                break;
            }
        }
        return Optional.ofNullable(result);
    }
}

class Cat {
    String name;

    public int getAge() {
        return age;
    }

    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }
}
