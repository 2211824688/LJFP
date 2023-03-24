package com.ljfp;

public class Tomato extends Shish {
    Shish s;
    Tomato(Shish s) {
        this.s = s;
    }
    boolean onlyOnions() {
        return false;
    }
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
