package com.walking.lesson8.task;

class Counter {

    String name;
    int count;

    public Counter(String name) {
        this(name, 0);
    }

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;

    }

    public void increase() {
        this.count += 1;
    }

    public void increaseTo(int value) {
        this.count += value;
    }

    public void reduce() {
        this.count -= 1;
    }

    public void reduceTo(int value) {
        this.count -= value;
    }

    @Override
    public String toString() {
        return "Counter " + name + "= " + count;
    }
}
