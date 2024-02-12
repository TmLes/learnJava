package com.vtb.task.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ContactList {
    Map<String, ArrayList<String>> contactList;

    public ContactList() {
        this.contactList = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        this.contactList.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    public void show() {

        contactList.entrySet().stream().
                sorted(Map.Entry.comparingByKey())
                .forEach((System.out::println));
    }

    public String get(String name) {
        if (this.contactList.get(name) != null) {
            return String.join(" ", this.contactList.get(name));
        } else {
            return "Name is not found";
        }

}

}
