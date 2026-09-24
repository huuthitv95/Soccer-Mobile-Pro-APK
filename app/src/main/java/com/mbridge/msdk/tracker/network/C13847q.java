package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.q */
/* JADX INFO: compiled from: NetworkResponse.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13847q {

    /* JADX INFO: renamed from: a */
    public final int f39514a;

    /* JADX INFO: renamed from: b */
    public final byte[] f39515b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f39516c;

    /* JADX INFO: renamed from: d */
    public final List<C13837g> f39517d;

    /* JADX INFO: renamed from: e */
    public final boolean f39518e;

    /* JADX INFO: renamed from: f */
    public final long f39519f;

    private C13847q(int i, byte[] bArr, Map<String, String> map, List<C13837g> list, boolean z, long j) {
        this.f39514a = i;
        this.f39515b = bArr;
        this.f39516c = map;
        if (list == null) {
            this.f39517d = null;
        } else {
            this.f39517d = Collections.unmodifiableList(list);
        }
        this.f39518e = z;
        this.f39519f = j;
    }

    public C13847q(int i, byte[] bArr, boolean z, long j, List<C13837g> list) {
        this(i, bArr, m41211a(list), list, z, j);
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m41211a(List<C13837g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C13837g c13837g : list) {
            treeMap.put(c13837g.m41105a(), c13837g.m41106b());
        }
        return treeMap;
    }
}
