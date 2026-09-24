package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.dd */
/* JADX INFO: loaded from: classes6.dex */
public class C12153dd {

    /* JADX INFO: renamed from: a */
    private boolean f30253a;

    /* JADX INFO: renamed from: b */
    private boolean f30254b;

    /* JADX INFO: renamed from: c */
    private boolean f30255c;

    /* JADX INFO: renamed from: d */
    private EnumC12233hd f30256d;

    /* JADX INFO: renamed from: e */
    private int f30257e;

    /* JADX INFO: renamed from: f */
    private int f30258f;

    /* JADX INFO: renamed from: com.ironsource.dd$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private boolean f30259a = true;

        /* JADX INFO: renamed from: b */
        private boolean f30260b = false;

        /* JADX INFO: renamed from: c */
        private boolean f30261c = false;

        /* JADX INFO: renamed from: d */
        private EnumC12233hd f30262d = null;

        /* JADX INFO: renamed from: e */
        private int f30263e = 0;

        /* JADX INFO: renamed from: f */
        private int f30264f = 0;

        /* JADX INFO: renamed from: a */
        public a m31323a(boolean z) {
            this.f30259a = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m31325a(boolean z, EnumC12233hd enumC12233hd, int i) {
            this.f30260b = z;
            if (enumC12233hd == null) {
                enumC12233hd = EnumC12233hd.PER_DAY;
            }
            this.f30262d = enumC12233hd;
            this.f30263e = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m31324a(boolean z, int i) {
            this.f30261c = z;
            this.f30264f = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C12153dd m31326a() {
            return new C12153dd(this.f30259a, this.f30260b, this.f30261c, this.f30262d, this.f30263e, this.f30264f);
        }
    }

    private C12153dd(boolean z, boolean z2, boolean z3, EnumC12233hd enumC12233hd, int i, int i2) {
        this.f30253a = z;
        this.f30254b = z2;
        this.f30255c = z3;
        this.f30256d = enumC12233hd;
        this.f30257e = i;
        this.f30258f = i2;
    }

    /* JADX INFO: renamed from: a */
    public EnumC12233hd m31317a() {
        return this.f30256d;
    }

    /* JADX INFO: renamed from: b */
    public int m31318b() {
        return this.f30257e;
    }

    /* JADX INFO: renamed from: c */
    public int m31319c() {
        return this.f30258f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m31320d() {
        return this.f30254b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m31321e() {
        return this.f30253a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m31322f() {
        return this.f30255c;
    }
}
