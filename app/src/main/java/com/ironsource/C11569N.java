package com.ironsource;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.N */
/* JADX INFO: loaded from: classes6.dex */
public final class C11569N {

    /* JADX INFO: renamed from: a */
    public static final C11569N f25195a = new C11569N();

    /* JADX INFO: renamed from: b */
    private static final HashMap<String, Long> f25196b = new HashMap<>();

    private C11569N() {
    }

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Long> m26592a() {
        return f25196b;
    }

    /* JADX INFO: renamed from: b */
    public final long m26595b(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = f25196b.get(instance);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: c */
    public final long m26596c(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = f25196b.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26594a(String instance, long j) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f25196b;
        if (map.containsKey(instance)) {
            return false;
        }
        map.put(instance, Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26593a(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HashMap<String, Long> map = f25196b;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }
}
