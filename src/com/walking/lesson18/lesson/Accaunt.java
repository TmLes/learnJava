package com.walking.lesson18.lesson;

class Accaunt <T> {
    private T id;
    private int sum;

    public Accaunt(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public T getId() {
        return id;
    }

}
