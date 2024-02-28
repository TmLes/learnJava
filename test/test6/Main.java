package test.test6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {
    Path path = Path.of("resources/util/words.txt");
    try {
      long startTime = System.currentTimeMillis();
      List<String> lines = Files.readAllLines(path);
      List<String> words = new ArrayList<>();
      for (String s : lines) {
        if (isPalindrome(s)) {
          words.add(s);
        }
      }
      long endTime = System.currentTimeMillis();
      System.out.println((endTime - startTime) / 1000);
      System.out.println(words);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public static boolean isPalindrome(String s) {
    List<Character> chList = new LinkedList<>();
        for (char ch : s.toCharArray()) {
          chList.add(ch);
        }
        System.out.println(chList);
        ListIterator<Character> iterator = chList.listIterator();
        ListIterator<Character> reverseIterator = chList.listIterator(chList.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
          if (iterator.next() != reverseIterator.previous()) {
            isPalindrome = false;
            break;
          }
        }
        return isPalindrome;
  }
}

