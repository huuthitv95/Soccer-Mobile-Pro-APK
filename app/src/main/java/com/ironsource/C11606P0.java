package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.P0 */
/* JADX INFO: loaded from: classes6.dex */
public class C11606P0 {

    /* JADX INFO: renamed from: e */
    public static final int f25317e = -1;

    /* JADX INFO: renamed from: a */
    private final a f25318a;

    /* JADX INFO: renamed from: b */
    private final long f25319b;

    /* JADX INFO: renamed from: c */
    private final long f25320c;

    /* JADX INFO: renamed from: d */
    private final long f25321d;

    /* JADX INFO: renamed from: com.ironsource.P0$a */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C11606P0(a aVar, long j, long j2, long j3) {
        this.f25318a = aVar;
        this.f25319b = j;
        this.f25320c = j2;
        this.f25321d = j3;
    }

    /* JADX INFO: renamed from: a */
    public a m26796a() {
        return this.f25318a;
    }

    /* JADX INFO: renamed from: b */
    public long m26797b() {
        return this.f25321d;
    }

    /* JADX INFO: renamed from: c */
    public long m26798c() {
        return this.f25320c;
    }

    /* JADX INFO: renamed from: d */
    public long m26799d() {
        return this.f25319b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m26800e() {
        a aVar = this.f25318a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    /* JADX INFO: renamed from: f */
    public boolean m26801f() {
        a aVar = this.f25318a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
