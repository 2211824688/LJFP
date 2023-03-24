package com.ljfp.shish;

public class Onion extends Shish {
    Shish s;
    Onion(Shish s) {
        this.s = s;
    }
    boolean onlyOnions() {
        return s.onlyOnions();
    }
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
