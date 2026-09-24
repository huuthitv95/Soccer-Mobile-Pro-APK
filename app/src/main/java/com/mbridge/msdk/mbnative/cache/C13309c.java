package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.cache.c */
/* JADX INFO: compiled from: NativeCacheFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13309c {

    /* JADX INFO: renamed from: a */
    public static Map<Integer, AbstractC13308b<String, List<Campaign>>> f36825a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static AbstractC13308b<String, List<Campaign>> m38392a(int i) {
        if (f36825a.containsKey(Integer.valueOf(i))) {
            return f36825a.get(Integer.valueOf(i));
        }
        C13307a c13307a = new C13307a(i);
        f36825a.put(Integer.valueOf(i), c13307a);
        return c13307a;
    }
}
