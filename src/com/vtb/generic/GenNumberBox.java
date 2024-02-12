package com.vtb.generic;

public class GenNumberBox<N extends Number> {
    private N[] box;

    @SafeVarargs
    public GenNumberBox(N... box) {
        this.box = box;
    }

    public N[] getBox() {
        return box;
    }

    public void setBox(N[] box) {
        this.box = box;
    }
    double average() {
        double avg = .0;
        for (N n : box) {
            avg += n.doubleValue();
        }
        return avg / box.length;
    }

    public boolean CompareGenNumberBox(GenNumberBox<?> another) {
        return Math.abs(this.average() - another.average()) < 0.000001;
    }
}
