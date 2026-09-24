package com.bytedance.adsdk.p077ri.p078lr.p083ka;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2198ri implements InterfaceC2194fi {
    TRUE,
    FALSE,
    NULL;


    /* JADX INFO: renamed from: ka */
    private static final Map<String, EnumC2198ri> f5446ka = new HashMap(128);

    static {
        for (EnumC2198ri enumC2198ri : values()) {
            f5446ka.put(enumC2198ri.name().toLowerCase(), enumC2198ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2198ri m7286ri(String str) {
        return f5446ka.get(str.toLowerCase());
    }
}
