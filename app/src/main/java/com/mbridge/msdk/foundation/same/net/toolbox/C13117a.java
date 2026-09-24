package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.C13837g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.toolbox.a */
/* JADX INFO: compiled from: NetworkResponse.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13117a {

    /* JADX INFO: renamed from: a */
    public final byte[] f35979a;

    /* JADX INFO: renamed from: b */
    public final List<C13837g> f35980b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f35981c;

    /* JADX INFO: renamed from: d */
    public final int f35982d;

    public C13117a(int i, byte[] bArr, List<C13837g> list) {
        this(i, bArr, m37207a(list), list);
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m37207a(List<C13837g> list) {
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

    private C13117a(int i, byte[] bArr, Map<String, String> map, List<C13837g> list) {
        this.f35982d = i;
        this.f35979a = bArr;
        this.f35981c = map;
        if (list == null) {
            this.f35980b = null;
        } else {
            this.f35980b = Collections.unmodifiableList(list);
        }
    }
}
