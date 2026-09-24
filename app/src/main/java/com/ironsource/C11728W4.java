package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.W4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11728W4 {

    /* JADX INFO: renamed from: h */
    private static C11728W4 f26078h;

    /* JADX INFO: renamed from: a */
    private String f26079a;

    /* JADX INFO: renamed from: b */
    private String f26080b;

    /* JADX INFO: renamed from: c */
    private String f26081c;

    /* JADX INFO: renamed from: d */
    private String f26082d;

    /* JADX INFO: renamed from: e */
    private int f26083e;

    /* JADX INFO: renamed from: f */
    private String f26084f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC12582w7 f26085g;

    private C11728W4(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        this.f26085g = interfaceC12582w7Mo25842a;
        this.f26079a = interfaceC12582w7Mo25842a.mo27921q();
        this.f26080b = interfaceC12582w7Mo25842a.mo27912l();
        this.f26081c = interfaceC12582w7Mo25842a.mo27899f();
        this.f26082d = interfaceC12582w7Mo25842a.mo27905i();
        this.f26083e = interfaceC12582w7Mo25842a.mo27897e();
        this.f26084f = interfaceC12582w7Mo25842a.mo27930v(context);
    }

    /* JADX INFO: renamed from: b */
    public static C11728W4 m27793b(Context context) {
        if (f26078h == null) {
            f26078h = new C11728W4(context);
        }
        return f26078h;
    }

    /* JADX INFO: renamed from: g */
    public static void m27794g() {
        f26078h = null;
    }

    /* JADX INFO: renamed from: a */
    public int m27796a() {
        return this.f26083e;
    }

    /* JADX INFO: renamed from: c */
    public String m27798c() {
        return this.f26080b;
    }

    /* JADX INFO: renamed from: d */
    public String m27799d() {
        return this.f26079a;
    }

    /* JADX INFO: renamed from: e */
    public String m27800e() {
        return this.f26081c;
    }

    /* JADX INFO: renamed from: f */
    public String m27801f() {
        return this.f26082d;
    }

    /* JADX INFO: renamed from: a */
    public float m27795a(Context context) {
        return this.f26085g.mo27874F(context);
    }

    /* JADX INFO: renamed from: b */
    public String m27797b() {
        return this.f26084f;
    }
}
