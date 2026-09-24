package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.O0 */
/* JADX INFO: loaded from: classes6.dex */
public class C11588O0 {

    /* JADX INFO: renamed from: e */
    public static final int f25257e = -1;

    /* JADX INFO: renamed from: a */
    private final a f25258a;

    /* JADX INFO: renamed from: b */
    private final long f25259b;

    /* JADX INFO: renamed from: c */
    private final long f25260c;

    /* JADX INFO: renamed from: d */
    private final long f25261d;

    /* JADX INFO: renamed from: com.ironsource.O0$a */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C11588O0(a aVar, long j, long j2, long j3) {
        this.f25258a = aVar;
        this.f25259b = j;
        this.f25260c = j2;
        this.f25261d = j3;
    }

    /* JADX INFO: renamed from: a */
    public a m26706a() {
        return this.f25258a;
    }

    /* JADX INFO: renamed from: b */
    public long m26707b() {
        return this.f25261d;
    }

    /* JADX INFO: renamed from: c */
    public long m26708c() {
        return this.f25260c;
    }

    /* JADX INFO: renamed from: d */
    public long m26709d() {
        return this.f25259b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m26710e() {
        a aVar = this.f25258a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    /* JADX INFO: renamed from: f */
    public boolean m26711f() {
        a aVar = this.f25258a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
