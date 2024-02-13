package com.vtb.collection.hashMapExample;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("A", "Andrew");
        names.put("B", "Bob");

        for (Map.Entry<String, String> o : names.entrySet()) {
            System.out.print(o.getKey() + "---" + o.getValue() + "\n");
        }
        System.out.println(names.getOrDefault("C", "Cris"));
    }
}
