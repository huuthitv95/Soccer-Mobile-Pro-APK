package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.Rf */
/* JADX INFO: loaded from: classes6.dex */
public class C11654Rf {

    /* JADX INFO: renamed from: a */
    protected long f25603a;

    /* JADX INFO: renamed from: b */
    protected long f25604b;

    /* JADX INFO: renamed from: c */
    protected long f25605c;

    /* JADX INFO: renamed from: a */
    public long m27399a() {
        return Math.max(0L, this.f25603a - System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public void m27402b(long j) {
        this.f25605c = j;
        this.f25603a += j - this.f25604b;
    }

    /* JADX INFO: renamed from: c */
    public void m27403c(long j) {
        this.f25604b = j;
        this.f25605c = 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m27400a(long j) {
        this.f25603a = System.currentTimeMillis() + j;
    }

    /* JADX INFO: renamed from: b */
    public void m27401b() {
        this.f25603a = 0L;
        this.f25604b = 0L;
        this.f25605c = 0L;
    }
}
