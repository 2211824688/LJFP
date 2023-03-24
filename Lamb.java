package com.ljfp;

public class Lamb extends Shish {
    Shish s;
    Lamb(Shish s) {
        this.s = s;
    }
    boolean onlyOnions() {
        return false;
    }
    boolean isVegetarian() {
        return false;
    }
}
