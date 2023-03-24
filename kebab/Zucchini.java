package com.ljfp.kebab;

public class Zucchini extends Kebab {
    Kebab k;

    public Zucchini(Kebab k) {
        this.k = k;
    }

    boolean isVeggie() {
        return k.isVeggie();
    }

    Object whatHolder() {
        return k.whatHolder();
    }
}
