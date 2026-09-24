package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.fi */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2352fi {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);


    /* JADX INFO: renamed from: fi */
    private final int f6140fi;

    EnumC2352fi(int i) {
        this.f6140fi = i;
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2352fi m8114ri(int i) {
        if (i == 0) {
            return COLUMN;
        }
        if (i == 1) {
            return COLUMN_REVERSE;
        }
        if (i == 2) {
            return ROW;
        }
        if (i == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2352fi m8115ri(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m8116ri() {
        return this.f6140fi;
    }
}
