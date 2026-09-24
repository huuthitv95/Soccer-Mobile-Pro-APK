package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.ri */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2361ri {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7),
    SPACE_EVENLY(8);


    /* JADX INFO: renamed from: qt */
    private final int f6205qt;

    EnumC2361ri(int i) {
        this.f6205qt = i;
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2361ri m8174ri(int i) {
        switch (i) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            case 8:
                return SPACE_EVENLY;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2361ri m8175ri(String str) {
        str.hashCode();
        switch (str) {
            case "stretch":
                return STRETCH;
            case "baseline":
                return BASELINE;
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "auto":
                return AUTO;
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
    public int m8176ri() {
        return this.f6205qt;
    }
}
