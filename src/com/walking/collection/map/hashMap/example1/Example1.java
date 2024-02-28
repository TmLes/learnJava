package com.walking.collection.map.hashMap.example1;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Example1 {

  public static void main(String[] args) {
    var people = createMap();
    putIsReal(people, new User(5, "Oleg Ivanov"));
    getForKey(people, ThreadLocalRandom.current().nextInt(10));
    removeForKey(people, ThreadLocalRandom.current().nextInt(10));
    searchRandomName(people);
    showMap(people);

    Set<Integer> keys = getAllKey(people);
    Collection<String> values = getAllValues(people);

    showCollection(keys);
    showCollection(values);
  }

  static Map<Integer, String> createMap() {
    Map<Integer, String> people = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      User usr = new User();
      people.put(usr.getId(), usr.getFullName());
    }
    return people;
  }

  static void putIsReal(Map<Integer, String> people, User usr) {
    people.putIfAbsent(usr.getId(), usr.getFullName());
  }

  static <K, V> void getForKey(Map<K, V> people, K id) {
    System.out.println(people.get(id));
  }

  static <K, V> void removeForKey(Map<K, V> people, K id) {
    people.remove(id);
  }

  static void searchRandomName(Map<Integer, String> people) {
    User usr = new User();
    if (people.containsValue(usr.getFullName())) {
      System.out.println("User " + usr.getFullName() + " is found!");
    } else {
      System.out.println("User " + usr.getFullName() + " is not found!");
    }
  }

  static <K, V> Set<K> getAllKey(Map<K, V> map) {
    return map.keySet();
  }

  static <K, V> Collection<V> getAllValues(Map<K, V> map) {
    return map.values();
  }

  static <K, V> void showMap(Map<K, V> map) {
    for (Map.Entry<K, V> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }

  static <T> void showCollection(Collection<T> arg) {
    for (T t : arg) {
      System.out.println(t);
    }
  }
}
