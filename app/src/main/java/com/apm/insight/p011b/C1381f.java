package com.apm.insight.p011b;

import android.content.Context;

/* JADX INFO: renamed from: com.apm.insight.b.f */
/* JADX INFO: compiled from: CrashANRHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1381f {

    /* JADX INFO: renamed from: a */
    private static volatile C1381f f424a;

    /* JADX INFO: renamed from: c */
    private static C1382g f425c;

    /* JADX INFO: renamed from: b */
    private final C1377b f426b;

    private C1381f(Context context) {
        this.f426b = new C1377b(context);
        C1382g c1382g = new C1382g();
        f425c = c1382g;
        c1382g.m966a();
    }

    /* JADX INFO: renamed from: a */
    public static C1381f m945a(Context context) {
        if (f424a == null) {
            synchronized (C1381f.class) {
                if (f424a == null) {
                    f424a = new C1381f(context);
                }
            }
        }
        return f424a;
    }

    /* JADX INFO: renamed from: b */
    public static C1382g m946b() {
        return f425c;
    }

    /* JADX INFO: renamed from: a */
    public final C1377b m947a() {
        return this.f426b;
    }

    /* JADX INFO: renamed from: c */
    public final void m948c() {
        this.f426b.m920a();
    }

    /* JADX INFO: renamed from: d */
    public final void m949d() {
        this.f426b.m921b();
    }
}
