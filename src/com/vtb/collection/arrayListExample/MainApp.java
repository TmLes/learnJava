package com.vtb.collection.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("AA", "BBB", "BBBB", "BB", "C"));
        while (letters.remove("B"));
        System.out.println(letters);

        ArrayList<Integer> myList = new ArrayList<>(1_000);  // желательно заранее указать вместимость, чтобы избежать лишних увеличений
        myList.ensureCapacity(10_000);  // можно увеличить вместимость так
        for (int i = 0; i <= 10_000 ; i++) {
            myList.add(i);
        }
        System.out.println(myList.get(myList.size() - 1));
        myList.removeIf(x -> x % 2 == 0);
        myList.trimToSize();  // желательно сжать если освободилось много памяти

        Collections.shuffle(myList);

        Collections.sort(myList);
        System.out.println(myList);

        letters.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println(letters);
    }
}
