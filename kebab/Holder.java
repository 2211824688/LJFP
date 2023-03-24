package com.ljfp.kebab;

public class Holder extends Kebab {
    Object object;

    public Holder(Object object) {
        this.object = object;
    }

    boolean isVeggie() {
        return true;
    }

    Object whatHolder() {
        return object;
    }
}
