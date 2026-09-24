package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.Rd */
/* JADX INFO: loaded from: classes6.dex */
public class C11652Rd {

    /* JADX INFO: renamed from: o */
    private static final int f25582o = 0;

    /* JADX INFO: renamed from: a */
    private ArrayList<C12135cd> f25583a;

    /* JADX INFO: renamed from: b */
    private C11499J1 f25584b;

    /* JADX INFO: renamed from: c */
    private int f25585c;

    /* JADX INFO: renamed from: d */
    private boolean f25586d;

    /* JADX INFO: renamed from: e */
    private int f25587e;

    /* JADX INFO: renamed from: f */
    private int f25588f;

    /* JADX INFO: renamed from: g */
    private int f25589g;

    /* JADX INFO: renamed from: h */
    private long f25590h;

    /* JADX INFO: renamed from: i */
    private boolean f25591i;

    /* JADX INFO: renamed from: j */
    private boolean f25592j;

    /* JADX INFO: renamed from: k */
    private boolean f25593k;

    /* JADX INFO: renamed from: l */
    private C12135cd f25594l;

    /* JADX INFO: renamed from: m */
    private C12470s2 f25595m;

    /* JADX INFO: renamed from: n */
    private boolean f25596n;

    public C11652Rd() {
        this.f25583a = new ArrayList<>();
        this.f25584b = new C11499J1();
    }

    /* JADX INFO: renamed from: a */
    public void m27380a(C12135cd c12135cd) {
        if (c12135cd != null) {
            this.f25583a.add(c12135cd);
            if (this.f25594l == null) {
                this.f25594l = c12135cd;
            } else if (c12135cd.m32812a(0)) {
                this.f25594l = c12135cd;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m27381b() {
        return this.f25589g;
    }

    /* JADX INFO: renamed from: c */
    public int m27382c() {
        return this.f25588f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m27383d() {
        return this.f25596n;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList<C12135cd> m27384e() {
        return this.f25583a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m27385f() {
        return this.f25591i;
    }

    /* JADX INFO: renamed from: g */
    public int m27386g() {
        return this.f25585c;
    }

    /* JADX INFO: renamed from: h */
    public int m27387h() {
        return this.f25587e;
    }

    /* JADX INFO: renamed from: i */
    public long m27388i() {
        return TimeUnit.SECONDS.toMillis(this.f25587e);
    }

    /* JADX INFO: renamed from: j */
    public boolean m27389j() {
        return this.f25586d;
    }

    /* JADX INFO: renamed from: k */
    public C12470s2 m27390k() {
        return this.f25595m;
    }

    /* JADX INFO: renamed from: l */
    public long m27391l() {
        return this.f25590h;
    }

    /* JADX INFO: renamed from: m */
    public C11499J1 m27392m() {
        return this.f25584b;
    }

    /* JADX INFO: renamed from: n */
    public boolean m27393n() {
        return this.f25593k;
    }

    /* JADX INFO: renamed from: o */
    public boolean m27394o() {
        return this.f25592j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f25585c + ", bidderExclusive=" + this.f25586d + AbstractJsonLexerKt.END_OBJ;
    }

    public C11652Rd(int i, boolean z, int i2, int i3, C11499J1 c11499j1, C12470s2 c12470s2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f25583a = new ArrayList<>();
        this.f25585c = i;
        this.f25586d = z;
        this.f25587e = i2;
        this.f25584b = c11499j1;
        this.f25588f = i3;
        this.f25595m = c12470s2;
        this.f25589g = i4;
        this.f25596n = z2;
        this.f25590h = j;
        this.f25591i = z3;
        this.f25592j = z4;
        this.f25593k = z5;
    }

    /* JADX INFO: renamed from: a */
    public C12135cd m27379a(String str) {
        for (C12135cd c12135cd : this.f25583a) {
            if (c12135cd.m32814c().equals(str)) {
                return c12135cd;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C12135cd m27378a() {
        for (C12135cd c12135cd : this.f25583a) {
            if (c12135cd.m32815d()) {
                return c12135cd;
            }
        }
        return this.f25594l;
    }
}
