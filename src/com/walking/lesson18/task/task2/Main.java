package com.walking.lesson18.task.task2;

/*
 * Создать класс-обертку над объектом любого типа. Предусмотреть boolean-метод, проверяющий значение объекта на null.
 */

class NotNul <T> {
    private T value;

    public NotNul(T value) {
        this.value = value;
    }

    public boolean isNull() {
        return value == null;
    }
}

public class Main {
    public static void main(String[] args) {
        NotNul<Integer> var1 = new NotNul<>(5);
        NotNul<String> var2 = new NotNul<>("");
        NotNul<Object> var3 = new NotNul<>(null);

        System.out.println(var1.isNull());
        System.out.println(var2.isNull());
        System.out.println(var3.isNull());
    }
}
