package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.mj */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2359mj {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);


    /* JADX INFO: renamed from: ka */
    private final int f6196ka;

    EnumC2359mj(int i) {
        this.f6196ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2359mj m8171ri(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }
}
