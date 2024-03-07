package com.walking.fuctionalProg.funcInterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

class Cat {
    private final String name;
    private int age;

    public Cat() {
        String[] catName = {"Agatha", "Ada", "Aurora", "Alicia", "Bonnie", "Bertha",
                "Bella", "Barbie", "Christa", "Dana", "Dotty", "Eileen",
                "Ester", "Eden", "Greta", "Gina", "Gladys", "Gwen", "Halsey",
                "Kitty", "Karolyn", "Leona", "Lucy",
                "Laney", "Lily", "Melinda", "Naomi", "Rebecka", "Sylvia", "Sharyl",
                "Tessa", "Tina", "Una", "Vivien", "Wendy", "Alvin", "Archie", "Aron",
                "Colin", "Chip", "Casper", "Damian", "Eugene", "Felix", "Harish",
                "Hunter", "Ivor", "Jeff", "Jeremy", "Kester", "Kevin", "Logan", "Louis",
                "Leo", "Marshall", "Manuel", "Martin", "Norton", "Oscar", "Parker", "Patrick",
                "Ryan", "Ralph", "Riven", "Simon", "Sky", "Thomas", "Qantas", "Zack"};
        this.name = catName[ThreadLocalRandom.current().nextInt(0, catName.length)];
        this.age = ThreadLocalRandom.current().nextInt(0, 10);
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return getAge() == cat.getAge() && Objects.equals(getName(), cat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }

    public static List<Cat> getListCat(int size) {
        List<Cat> cats = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            cats.add(new Cat());
        }
        return cats;
    }


}
