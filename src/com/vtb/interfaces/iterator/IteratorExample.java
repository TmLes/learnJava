package com.vtb.interfaces.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("A");
        mySet.add("B");
        mySet.add("D");
        mySet.add("C");


        Iterator<String> iter = mySet.iterator();
        while (iter.hasNext()) {
            String o = iter.next();
            if (o.equals("A")) {
                iter.remove();
            }
        }
        for (String o : mySet) {
            System.out.println(o);
        }
    }
}
