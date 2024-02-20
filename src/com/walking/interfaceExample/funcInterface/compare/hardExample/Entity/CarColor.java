package com.walking.interfaceExample.funcInterface.compare.hardExample.Entity;

import java.util.Random;

public enum CarColor {
  WHITE("white"),
  BLACK("black"),
  BROWN("brown"),
  GREY("grey"),
  RED("red"),
  GREEN("green"),
  BLUE("blue"),
  YELLOW("yellow");

  private final String colorName;

  public String getColorName() {
    return colorName;
}

private CarColor(String colorName) {
    this.colorName = colorName;
}

public static CarColor getRandomCarColor() {
    Random random = new Random();
    return CarColor.values()[random.nextInt(CarColor.values().length)];
  }
}
