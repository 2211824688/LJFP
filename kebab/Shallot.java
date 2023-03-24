package com.ljfp.kebab;

public class Shallot extends Kebab {
    Kebab k;

    public Shallot(Kebab k) {
        this.k = k;
    }

    boolean isVeggie() {
        return k.isVeggie();
    }

    Object whatHolder() {
        return k.whatHolder();
    }
}
