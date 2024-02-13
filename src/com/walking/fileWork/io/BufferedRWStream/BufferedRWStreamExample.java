package com.walking.fileWork.io.BufferedRWStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWStreamExample {

  public static void main(String[] args) {
    try (
      BufferedReader br = new BufferedReader(
        new FileReader("resourses/test.txt")
      );
      BufferedWriter bw = new BufferedWriter(
        new FileWriter("resourses/newTest.txt")
      )
    ) {
    //   String line;
    //   while ((line = br.readLine()) != null) {
    //     System.out.println(line);
    //   }
      br.transferTo(bw);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
