package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8787l;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8516c {

    /* JADX INFO: renamed from: a */
    public final C8787l f19088a = new C8787l();

    /* JADX INFO: renamed from: b */
    public final long f19089b = ((long) 15000) * 1000;

    /* JADX INFO: renamed from: c */
    public final long f19090c = ((long) 30000) * 1000;

    /* JADX INFO: renamed from: d */
    public final long f19091d = 2500000;

    /* JADX INFO: renamed from: e */
    public final long f19092e = 5000000;

    /* JADX INFO: renamed from: f */
    public int f19093f;

    /* JADX INFO: renamed from: g */
    public boolean f19094g;

    /* JADX INFO: renamed from: a */
    public final void m21013a(boolean z) {
        this.f19093f = 0;
        this.f19094g = false;
        if (z) {
            C8787l c8787l = this.f19088a;
            synchronized (c8787l) {
                c8787l.m21308a(0);
            }
        }
    }
}
