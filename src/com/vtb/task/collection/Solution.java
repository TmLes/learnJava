package com.vtb.task.collection;

import java.util.*;

public class Solution {

    public static void demoSet() {
        String[] myArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Tuesday", "Monday"};
        Set<String> mySet = new HashSet<>();
        Collections.addAll(mySet, myArray);
        for (String s : mySet) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        demoSet();
        ContactList my = new ContactList();
        my.add("John", "+7987");
        my.add("Sam", "+79876842147");
        my.add("Ashly", "89876");
        System.out.println(my.get("John"));
        System.out.println(my.get("Michael"));
        my.show();
    }
}
