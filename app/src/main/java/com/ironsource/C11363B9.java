package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.B9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11363B9 {

    /* JADX INFO: renamed from: n */
    private static final int f23935n = 0;

    /* JADX INFO: renamed from: a */
    private ArrayList<C11435F9> f23936a;

    /* JADX INFO: renamed from: b */
    private C11499J1 f23937b;

    /* JADX INFO: renamed from: c */
    private int f23938c;

    /* JADX INFO: renamed from: d */
    private boolean f23939d;

    /* JADX INFO: renamed from: e */
    private int f23940e;

    /* JADX INFO: renamed from: f */
    private int f23941f;

    /* JADX INFO: renamed from: g */
    private C12470s2 f23942g;

    /* JADX INFO: renamed from: h */
    private boolean f23943h;

    /* JADX INFO: renamed from: i */
    private long f23944i;

    /* JADX INFO: renamed from: j */
    private boolean f23945j;

    /* JADX INFO: renamed from: k */
    private boolean f23946k;

    /* JADX INFO: renamed from: l */
    private boolean f23947l;

    /* JADX INFO: renamed from: m */
    private C11435F9 f23948m;

    public C11363B9() {
        this.f23936a = new ArrayList<>();
        this.f23937b = new C11499J1();
        this.f23942g = new C12470s2();
    }

    /* JADX INFO: renamed from: a */
    public void m25464a(C11435F9 c11435f9) {
        if (c11435f9 != null) {
            this.f23936a.add(c11435f9);
            if (this.f23948m == null) {
                this.f23948m = c11435f9;
            } else if (c11435f9.m32812a(0)) {
                this.f23948m = c11435f9;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m25465b() {
        return this.f23941f;
    }

    /* JADX INFO: renamed from: c */
    public int m25466c() {
        return this.f23938c;
    }

    /* JADX INFO: renamed from: d */
    public int m25467d() {
        return this.f23940e;
    }

    /* JADX INFO: renamed from: e */
    public long m25468e() {
        return TimeUnit.SECONDS.toMillis(this.f23940e);
    }

    /* JADX INFO: renamed from: f */
    public boolean m25469f() {
        return this.f23939d;
    }

    /* JADX INFO: renamed from: g */
    public C12470s2 m25470g() {
        return this.f23942g;
    }

    /* JADX INFO: renamed from: h */
    public long m25471h() {
        return this.f23944i;
    }

    /* JADX INFO: renamed from: i */
    public C11499J1 m25472i() {
        return this.f23937b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m25473j() {
        return this.f23943h;
    }

    /* JADX INFO: renamed from: k */
    public boolean m25474k() {
        return this.f23945j;
    }

    /* JADX INFO: renamed from: l */
    public boolean m25475l() {
        return this.f23947l;
    }

    /* JADX INFO: renamed from: m */
    public boolean m25476m() {
        return this.f23946k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f23938c + ", bidderExclusive=" + this.f23939d + AbstractJsonLexerKt.END_OBJ;
    }

    public C11363B9(int i, boolean z, int i2, C11499J1 c11499j1, C12470s2 c12470s2, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f23936a = new ArrayList<>();
        this.f23938c = i;
        this.f23939d = z;
        this.f23940e = i2;
        this.f23937b = c11499j1;
        this.f23942g = c12470s2;
        this.f23945j = z3;
        this.f23946k = z4;
        this.f23941f = i3;
        this.f23943h = z2;
        this.f23944i = j;
        this.f23947l = z5;
    }

    /* JADX INFO: renamed from: a */
    public C11435F9 m25463a(String str) {
        for (C11435F9 c11435f9 : this.f23936a) {
            if (c11435f9.m32814c().equals(str)) {
                return c11435f9;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C11435F9 m25462a() {
        for (C11435F9 c11435f9 : this.f23936a) {
            if (c11435f9.m32815d()) {
                return c11435f9;
            }
        }
        return this.f23948m;
    }
}
