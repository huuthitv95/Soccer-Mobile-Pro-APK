package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.ja */
/* JADX INFO: loaded from: classes6.dex */
public class C12266ja {

    /* JADX INFO: renamed from: c */
    private static C12266ja f30694c;

    /* JADX INFO: renamed from: a */
    private final HashSet<ImpressionDataListener> f30695a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, List<String>> f30696b = new ConcurrentHashMap<>();

    C12266ja() {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C12266ja m31872b() {
        if (f30694c == null) {
            f30694c = new C12266ja();
        }
        return f30694c;
    }

    /* JADX INFO: renamed from: a */
    public HashSet<ImpressionDataListener> m31873a() {
        return this.f30695a;
    }

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, List<String>> m31877c() {
        return this.f30696b;
    }

    /* JADX INFO: renamed from: d */
    public void m31878d() {
        synchronized (this) {
            this.f30695a.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31874a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f30695a.add(impressionDataListener);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31875a(String str, List<String> list) {
        this.f30696b.put(str, list);
    }

    /* JADX INFO: renamed from: b */
    public void m31876b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f30695a.remove(impressionDataListener);
        }
    }
}
