package com.ljfp.point;

public class ManhattanPt extends Point {

    public ManhattanPt(int x, int y) {
        super(x, y);
    }

    @Override
    int distanceTo0() {
        return x + y;
    }
}
