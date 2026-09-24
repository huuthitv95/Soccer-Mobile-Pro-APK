package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8717a implements InterfaceC8801z {

    /* JADX INFO: renamed from: a */
    public final C8786k f20333a;

    /* JADX INFO: renamed from: b */
    public final int f20334b;

    /* JADX INFO: renamed from: c */
    public final C8708o f20335c;

    /* JADX INFO: renamed from: d */
    public final int f20336d;

    /* JADX INFO: renamed from: e */
    public final Object f20337e;

    /* JADX INFO: renamed from: f */
    public final long f20338f;

    /* JADX INFO: renamed from: g */
    public final long f20339g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8783h f20340h;

    public AbstractC8717a(int i, int i2, long j, long j2, C8708o c8708o, InterfaceC8783h interfaceC8783h, C8786k c8786k, Object obj) {
        interfaceC8783h.getClass();
        this.f20340h = interfaceC8783h;
        this.f20333a = c8786k;
        this.f20334b = i;
        this.f20335c = c8708o;
        this.f20336d = i2;
        this.f20337e = obj;
        this.f20338f = j;
        this.f20339g = j2;
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo21063c();
}
