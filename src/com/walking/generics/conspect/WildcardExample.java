package com.walking.generics.conspect;

import java.util.ArrayList;

public class WildcardExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(28);
        showSumm(list);
    }

    public static void showSumm(ArrayList<? extends Number> list) {
        double summ = 0;
        for (Number n : list) {
            summ += n.doubleValue();
        }
        System.out.println(summ);
    }
}
