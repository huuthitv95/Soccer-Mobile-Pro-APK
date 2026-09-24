package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8807f {

    /* JADX INFO: renamed from: a */
    public final int f20617a;

    /* JADX INFO: renamed from: b */
    public final int f20618b;

    /* JADX INFO: renamed from: c */
    public final int f20619c;

    /* JADX INFO: renamed from: d */
    public final long f20620d;

    public C8807f(byte[] bArr) {
        C8814m c8814m = new C8814m(bArr);
        c8814m.m21334b(136);
        c8814m.m21332a(16);
        c8814m.m21332a(16);
        c8814m.m21332a(24);
        c8814m.m21332a(24);
        this.f20617a = c8814m.m21332a(20);
        this.f20618b = c8814m.m21332a(3) + 1;
        this.f20619c = c8814m.m21332a(5) + 1;
        this.f20620d = ((((long) c8814m.m21332a(4)) & 15) << 32) | (((long) c8814m.m21332a(32)) & 4294967295L);
    }
}
