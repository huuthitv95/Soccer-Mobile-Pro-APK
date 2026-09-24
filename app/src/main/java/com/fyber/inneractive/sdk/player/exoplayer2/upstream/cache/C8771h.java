package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8771h {

    /* JADX INFO: renamed from: a */
    public final int f20493a;

    /* JADX INFO: renamed from: b */
    public final String f20494b;

    /* JADX INFO: renamed from: c */
    public final TreeSet f20495c = new TreeSet();

    /* JADX INFO: renamed from: d */
    public long f20496d;

    public C8771h(int i, String str, long j) {
        this.f20493a = i;
        this.f20494b = str;
        this.f20496d = j;
    }

    /* JADX INFO: renamed from: a */
    public final C8776m m21294a(long j) {
        C8776m c8776m = new C8776m(this.f20494b, j, -1L, -9223372036854775807L, null);
        C8776m c8776m2 = (C8776m) this.f20495c.floor(c8776m);
        if (c8776m2 != null && c8776m2.f20488b + c8776m2.f20489c > j) {
            return c8776m2;
        }
        C8776m c8776m3 = (C8776m) this.f20495c.ceiling(c8776m);
        return c8776m3 == null ? new C8776m(this.f20494b, j, -1L, -9223372036854775807L, null) : new C8776m(this.f20494b, j, c8776m3.f20488b - j, -9223372036854775807L, null);
    }
}
