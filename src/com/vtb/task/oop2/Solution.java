package com.vtb.task.oop2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

interface Barrier {
    boolean pass(Movers mover);
}

interface Movers {
    boolean run(int value);
    boolean jump(int value);
}

class Wall implements Barrier {
    private final int height;

    public Wall() {
        var r = new Random();
        this.height = r.nextInt(2, 5);
    }

    @Override
    public boolean pass(Movers mover) {
        return mover.jump(height);
    }
}

class SpeedRoad implements Barrier {
    private final int width;

    public SpeedRoad() {
        Random r = new Random();
        this.width = r.nextInt(5, 11);
    }

    @Override
    public boolean pass(Movers mover) {
        return mover.run(width);
    }
}

class Human implements Movers {
    private int stamina;

    public Human() {
        Random r = new Random();
        this.stamina = r.nextInt(50);
    }

    @Override
    public boolean run(int value) {
        return move("пробежал", value);
    }

    @Override
    public boolean jump(int value) {
        return move("перепрыгнул", value);
    }

    private boolean move(String action, int value) {
        String name = "Human";
        if (stamina >= value) {
            System.out.println(name + " успешно " + action + " " + value + " и продолжает гонку!");
            stamina -= value;
            return true;
        } else {
            System.out.println(name + " устал и выбывает из гонки.");
            return false;
        }
    }
}

class Robot implements Movers {
    private int stamina;

    public Robot() {
        Random r = new Random();
        this.stamina = r.nextInt(50);
    }

    @Override
    public boolean run(int value) {
        return move("пробежал", value);
    }

    @Override
    public boolean jump(int value) {
        return move("перепрыгнул", value);
    }

    private boolean move(String action, int value) {
        String name = "Robot";
        if (stamina >= value) {
            System.out.println(name + " успешно " + action + " " + value + " и продолжает гонку!");
            stamina -= value;
            return true;
        } else {
            System.out.println(name + " устал и выбывает из гонки.");
            return false;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        List<Barrier> road = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            road.add(new Wall());
            road.add(new SpeedRoad());
        }
        Collections.shuffle(road);

        Movers[] movers = {new Human(), new Robot()};

        for (Movers mover : movers) {
            for (Barrier barrier : road) {
                if (!barrier.pass(mover)) {
                    break;
                }
            }
        }
    }
}
