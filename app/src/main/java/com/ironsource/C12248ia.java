package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.ia */
/* JADX INFO: loaded from: classes6.dex */
public class C12248ia {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m31737a(Object[][] objArr) {
        HashMap map = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
            }
        }
        return map;
    }
}
