package com.ljfp.kebab;

public class Shrimp extends Kebab {
    Kebab k;

    public Shrimp(Kebab k) {
        this.k = k;
    }

    boolean isVeggie() {
        return false;
    }

    Object whatHolder() {
        return k.whatHolder();
    }
}
