package com.mbridge.msdk.tracker.network;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.b0 */
/* JADX INFO: compiled from: VolleyError.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13831b0 extends Exception {

    /* JADX INFO: renamed from: a */
    public final C13847q f39434a;

    /* JADX INFO: renamed from: b */
    private long f39435b;

    /* JADX INFO: renamed from: c */
    private int f39436c;

    /* JADX INFO: renamed from: d */
    private String f39437d;

    public AbstractC13831b0() {
        this.f39436c = 0;
        this.f39437d = "";
        this.f39434a = null;
    }

    public AbstractC13831b0(C13847q c13847q) {
        this.f39436c = 0;
        this.f39437d = "";
        this.f39434a = c13847q;
    }

    public AbstractC13831b0(String str) {
        super(str);
        this.f39436c = 0;
        this.f39437d = "";
        this.f39434a = null;
    }

    public AbstractC13831b0(Throwable th) {
        super(th);
        this.f39436c = 0;
        this.f39437d = "";
        this.f39434a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m41089a(int i) {
        this.f39436c = i;
    }

    /* JADX INFO: renamed from: a */
    void m41090a(long j) {
        this.f39435b = j;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo41087d();

    /* JADX INFO: renamed from: g */
    public int m41091g() {
        return this.f39436c;
    }
}
