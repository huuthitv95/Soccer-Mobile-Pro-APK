package com.bytedance.adsdk.p077ri.p078lr.p083ka;

import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ka.ka */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2196ka implements InterfaceC2194fi {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(C11744X3.j.f26438d),
    RIGHT_BRACKET(C11744X3.j.f26440e),
    COMMA(",");


    /* JADX INFO: renamed from: di */
    private static final Map<String, EnumC2196ka> f5435di;
    private final String xha;

    static {
        HashMap map = new HashMap(128);
        f5435di = map;
        for (EnumC2196ka enumC2196ka : map.values()) {
            f5435di.put(enumC2196ka.m7284ri(), enumC2196ka);
        }
    }

    EnumC2196ka(String str) {
        this.xha = str;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m7283ri(InterfaceC2194fi interfaceC2194fi) {
        return interfaceC2194fi instanceof EnumC2196ka;
    }

    /* JADX INFO: renamed from: ri */
    public String m7284ri() {
        return this.xha;
    }
}
