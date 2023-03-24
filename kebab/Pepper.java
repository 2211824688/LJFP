package com.ljfp.kebab;

public class Pepper extends Kebab {
    Kebab k;

    public Pepper(Kebab k) {
        this.k = k;
    }

    boolean isVeggie() {
        return k.isVeggie();
    }

    Object whatHolder() {
        return k.whatHolder();
    }
}
