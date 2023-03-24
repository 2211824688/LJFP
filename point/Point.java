package com.ljfp.point;

public abstract class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean closerTo0(Point that) {
        return this.distanceTo0() <= that.distanceTo0();
    }

    abstract int distanceTo0();
}
