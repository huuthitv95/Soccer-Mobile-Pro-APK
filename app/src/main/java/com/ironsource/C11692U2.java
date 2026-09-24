package com.ironsource;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.U2 */
/* JADX INFO: loaded from: classes6.dex */
public class C11692U2 {

    /* JADX INFO: renamed from: p */
    private static final int f25831p = 0;

    /* JADX INFO: renamed from: a */
    private C11499J1 f25832a;

    /* JADX INFO: renamed from: b */
    private int f25833b;

    /* JADX INFO: renamed from: c */
    private long f25834c;

    /* JADX INFO: renamed from: d */
    private boolean f25835d;

    /* JADX INFO: renamed from: e */
    private ArrayList<C12161e3> f25836e;

    /* JADX INFO: renamed from: f */
    private C12161e3 f25837f;

    /* JADX INFO: renamed from: g */
    private int f25838g;

    /* JADX INFO: renamed from: h */
    private int f25839h;

    /* JADX INFO: renamed from: i */
    private C12470s2 f25840i;

    /* JADX INFO: renamed from: j */
    private boolean f25841j;

    /* JADX INFO: renamed from: k */
    private long f25842k;

    /* JADX INFO: renamed from: l */
    private boolean f25843l;

    /* JADX INFO: renamed from: m */
    private boolean f25844m;

    /* JADX INFO: renamed from: n */
    private boolean f25845n;

    /* JADX INFO: renamed from: o */
    private long f25846o;

    public C11692U2() {
        this.f25832a = new C11499J1();
        this.f25836e = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public int m27555a() {
        return this.f25833b;
    }

    /* JADX INFO: renamed from: b */
    public long m27558b() {
        return this.f25834c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m27559c() {
        return this.f25835d;
    }

    /* JADX INFO: renamed from: d */
    public C12470s2 m27560d() {
        return this.f25840i;
    }

    /* JADX INFO: renamed from: e */
    public long m27561e() {
        return this.f25842k;
    }

    /* JADX INFO: renamed from: f */
    public int m27562f() {
        return this.f25839h;
    }

    /* JADX INFO: renamed from: g */
    public C11499J1 m27563g() {
        return this.f25832a;
    }

    /* JADX INFO: renamed from: h */
    public int m27564h() {
        return this.f25838g;
    }

    /* JADX INFO: renamed from: i */
    public C12161e3 m27565i() {
        for (C12161e3 c12161e3 : this.f25836e) {
            if (c12161e3.m32815d()) {
                return c12161e3;
            }
        }
        C12161e3 c12161e4 = this.f25837f;
        return c12161e4 != null ? c12161e4 : new C12243i5();
    }

    /* JADX INFO: renamed from: j */
    public long m27566j() {
        return this.f25846o;
    }

    /* JADX INFO: renamed from: k */
    public boolean m27567k() {
        return this.f25841j;
    }

    /* JADX INFO: renamed from: l */
    public boolean m27568l() {
        return this.f25843l;
    }

    /* JADX INFO: renamed from: m */
    public boolean m27569m() {
        return this.f25845n;
    }

    /* JADX INFO: renamed from: n */
    public boolean m27570n() {
        return this.f25844m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f25833b + ", bidderExclusive=" + this.f25835d + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: a */
    public void m27557a(C12161e3 c12161e3) {
        if (c12161e3 != null) {
            this.f25836e.add(c12161e3);
            if (this.f25837f == null) {
                this.f25837f = c12161e3;
            } else if (c12161e3.m32812a(0)) {
                this.f25837f = c12161e3;
            }
        }
    }

    public C11692U2(int i, long j, boolean z, C11499J1 c11499j1, int i2, C12470s2 c12470s2, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.f25836e = new ArrayList<>();
        this.f25833b = i;
        this.f25834c = j;
        this.f25835d = z;
        this.f25832a = c11499j1;
        this.f25838g = i2;
        this.f25839h = i3;
        this.f25840i = c12470s2;
        this.f25841j = z2;
        this.f25842k = j2;
        this.f25843l = z3;
        this.f25844m = z4;
        this.f25845n = z5;
        this.f25846o = j3;
    }

    /* JADX INFO: renamed from: a */
    public C12161e3 m27556a(String str) {
        for (C12161e3 c12161e3 : this.f25836e) {
            if (c12161e3.m32814c().equals(str)) {
                return c12161e3;
            }
        }
        return null;
    }
}
