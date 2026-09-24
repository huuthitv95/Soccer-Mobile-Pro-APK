package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.di */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2351di {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    private final int xha;

    EnumC2351di(int i) {
        this.xha = i;
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2351di m8110ri(int i) {
        if (i == 0) {
            return FLEX_START;
        }
        if (i == 1) {
            return CENTER;
        }
        if (i == 2) {
            return FLEX_END;
        }
        if (i == 3) {
            return SPACE_BETWEEN;
        }
        if (i == 4) {
            return SPACE_AROUND;
        }
        if (i == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2351di m8111ri(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "space_evenly":
                return SPACE_EVENLY;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m8112ri() {
        return this.xha;
    }
}
