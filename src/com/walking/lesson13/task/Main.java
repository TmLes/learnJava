package com.walking.lesson13.task;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = {new Triangle(), new Square()};
        for (Figure fg : figure) {
            fg.show();
        }
    }
}

class Figure {
    public void show() {
        System.out.println();
    }
}
class Triangle extends Figure {
    public void show() {
        System.out.println("I`m a triangle");
    }
}

class Square extends Figure {
    @Override
    public void show() {
        System.out.println("I`m a square");
    }
}
