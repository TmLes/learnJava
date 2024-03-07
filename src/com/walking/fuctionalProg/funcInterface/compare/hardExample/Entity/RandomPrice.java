package com.walking.fuctionalProg.funcInterface.compare.hardExample.Entity;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPrice {
    /**
     * @return рандомное число от 1млн до 5 млн кратное 100000
     */
    public static int getRandomPrice() {
        return ThreadLocalRandom.current().nextInt(1_000_000 / 100_000, (5_000_000 / 100_000) + 1) * 100_000;
    }
}
