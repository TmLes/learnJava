package com.walking.lesson14.lesson;

public enum Color {
    WHITE(1), BLACK(2), GREY(3);
    private final int id;
    Color(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
