package com.walking.fuctionalProg.funcInterface.compare.hardExample.Entity;

import java.util.Random;

public enum Model {
  PRIORA("Priora"),
  KALINA("Kalina"),
  GRANTA("Granta"),
  VESTA("Vesta");

  private final String modelName;

  public String getModelName() {
    return modelName;
  }

  private Model(String modelName) {
    this.modelName = modelName;
  }

  public static Model getRandomModel() {
    Random random = new Random();
    return Model.values()[random.nextInt(Model.values().length)];
  }
}
