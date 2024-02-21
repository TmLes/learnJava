package com.walking.generics.conspect;

class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> i1 = new Info<>("Hello!");
        System.out.println(i1);
        Info<Integer> i2 = new Info<>(5);
        int num = i2.getValue().intValue();
        System.out.println(num);
    }
}

/*
 * Параметризованый класс может принимать значение любого ссылочного типа
 */
class Info<T> {
    private T value;

    /*
     * Конструктор обязателен
     */
    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public String toString() {
        return "<- " + value + " ->";
    }
}
