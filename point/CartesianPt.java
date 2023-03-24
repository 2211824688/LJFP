package com.ljfp.point;

public class CartesianPt extends Point {

    public CartesianPt(int x, int y) {
        super(x, y);
    }

    @Override
    int distanceTo0() {
        return (int) Math.sqrt(x*x + y*y);
    }
}
