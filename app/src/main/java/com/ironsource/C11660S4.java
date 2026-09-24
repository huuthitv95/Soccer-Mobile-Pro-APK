package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.S4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11660S4 {

    /* JADX INFO: renamed from: h */
    public static final int f25626h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f25627i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f25628j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f25629k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f25630l = -1;

    /* JADX INFO: renamed from: a */
    private String f25631a;

    /* JADX INFO: renamed from: b */
    private String f25632b;

    /* JADX INFO: renamed from: c */
    private int f25633c;

    /* JADX INFO: renamed from: d */
    private Map<String, String> f25634d;

    /* JADX INFO: renamed from: e */
    private int f25635e;

    /* JADX INFO: renamed from: f */
    private boolean f25636f;

    /* JADX INFO: renamed from: g */
    private C11471H9 f25637g;

    public C11660S4(String str, String str2, Map<String, String> map, InterfaceC11384Cc interfaceC11384Cc) {
        this.f25633c = -1;
        this.f25632b = str;
        this.f25631a = str2;
        this.f25634d = map;
        this.f25635e = 0;
        this.f25636f = false;
        this.f25637g = null;
    }

    /* JADX INFO: renamed from: a */
    public void m27437a(boolean z) {
        this.f25636f = z;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m27440b(int i) {
        this.f25635e = i;
    }

    /* JADX INFO: renamed from: c */
    public C11471H9 m27441c() {
        return this.f25637g;
    }

    /* JADX INFO: renamed from: d */
    public boolean m27443d() {
        return this.f25636f;
    }

    /* JADX INFO: renamed from: e */
    public int m27444e() {
        return this.f25635e;
    }

    /* JADX INFO: renamed from: f */
    public String m27445f() {
        return this.f25631a;
    }

    /* JADX INFO: renamed from: g */
    public Map<String, String> m27446g() {
        return this.f25634d;
    }

    /* JADX INFO: renamed from: h */
    public String m27447h() {
        return this.f25632b;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC11384Cc m27448i() {
        if (this.f25637g != null) {
            return m27441c().m25992b();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m27449j() {
        return this.f25633c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m27450k() {
        Map<String, String> map = this.f25634d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f25634d.get("rewarded"));
    }

    /* JADX INFO: renamed from: a */
    public boolean m27438a(int i) {
        return this.f25633c == i;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m27439b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f25632b);
        map.put("demandSourceName", this.f25631a);
        Map<String, String> map2 = this.f25634d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public void m27442c(int i) {
        this.f25633c = i;
    }

    /* JADX INFO: renamed from: a */
    public void m27436a() {
        Map<String, String> map = this.f25634d;
        if (map != null) {
            map.clear();
        }
        this.f25634d = null;
    }

    public C11660S4(C11471H9 c11471h9) {
        this(c11471h9.m25995e(), c11471h9.m25997g(), c11471h9.m25989a(), c11471h9.m25992b());
        this.f25637g = c11471h9;
    }
}
