package com.ljfp.kebab;

public class Radish extends Kebab {
    Kebab k;

    public Radish(Kebab k) {
        this.k = k;
    }

    boolean isVeggie() {
        return k.isVeggie();
    }

    Object whatHolder() {
        return k.whatHolder();
    }
}
