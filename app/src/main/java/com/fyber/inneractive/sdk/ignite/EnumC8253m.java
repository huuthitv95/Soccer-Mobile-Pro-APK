package com.fyber.inneractive.sdk.ignite;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.m */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8253m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP("st"),
    NONE("none");

    private static final Map<String, EnumC8253m> CONSTANTS = new HashMap();
    private final String value;

    static {
        for (EnumC8253m enumC8253m : values()) {
            CONSTANTS.put(enumC8253m.value, enumC8253m);
        }
    }

    EnumC8253m(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC8253m m20653a(String str) {
        return CONSTANTS.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m20654a() {
        return this.value;
    }
}
