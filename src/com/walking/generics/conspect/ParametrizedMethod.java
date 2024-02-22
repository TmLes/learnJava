package com.walking.generics.conspect;

import java.util.ArrayList;

class ParametrizedMethod {
    public static void main(String[] args) {

    }


/*
 * Пример параметризованого метода(если метод прописан в пар. классе <T> перед возвращаемым значением можно не писать)
 */
    public static <T> void showAray(ArrayList<T> arr) {
        for(T t : arr) {
            System.out.println(t);
        }
    }
}
