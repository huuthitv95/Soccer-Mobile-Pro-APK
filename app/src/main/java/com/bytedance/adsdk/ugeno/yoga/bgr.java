package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum bgr {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);


    /* JADX INFO: renamed from: ka */
    private final int f6127ka;

    bgr(int i) {
        this.f6127ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public static bgr m8105ri(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: renamed from: ri */
    public static bgr m8106ri(String str) {
        str.hashCode();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m8107ri() {
        return this.f6127ka;
    }
}
