package com.walking.lesson17.lesson;

public class LengthException extends Exception {
    private int number;
    public int getNumber() {
        return number;
    }
    public LengthException(String msg, int number) {
        super(msg);
        this.number = number;
    }
}
