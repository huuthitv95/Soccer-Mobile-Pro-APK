package com.ironsource.adqualitysdk.sdk.p286i;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dy */
/* JADX INFO: loaded from: classes6.dex */
public final class C11914dy {

    /* JADX INFO: renamed from: ﻛ */
    private static Map<String, String> f28742 = new HashMap();

    /* JADX INFO: renamed from: ﾇ */
    public static String m30142(String str) {
        String str2 = f28742.get(str);
        if (str2 != null) {
            return str2;
        }
        f28742.put(str, str);
        return str;
    }
}
