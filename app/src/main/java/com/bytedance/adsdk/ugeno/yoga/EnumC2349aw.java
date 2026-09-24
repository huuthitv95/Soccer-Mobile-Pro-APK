package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.aw */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2349aw {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);


    /* JADX INFO: renamed from: ka */
    private final int f6122ka;

    EnumC2349aw(int i) {
        this.f6122ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2349aw m8101ri(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2349aw m8102ri(String str) {
        str.hashCode();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m8103ri() {
        return this.f6122ka;
    }
}
