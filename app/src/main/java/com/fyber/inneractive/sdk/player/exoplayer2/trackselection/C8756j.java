package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.C8742t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8756j {

    /* JADX INFO: renamed from: a */
    public final C8741z f20446a;

    /* JADX INFO: renamed from: b */
    public final C8754h f20447b;

    /* JADX INFO: renamed from: c */
    public final Object f20448c;

    /* JADX INFO: renamed from: d */
    public final C8742t[] f20449d;

    public C8756j(C8741z c8741z, C8754h c8754h, C8752f c8752f, C8742t[] c8742tArr) {
        this.f20446a = c8741z;
        this.f20447b = c8754h;
        this.f20448c = c8752f;
        this.f20449d = c8742tArr;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21285a(C8756j c8756j, int i) {
        return c8756j != null && AbstractC8827z.m21386a(this.f20447b.f20444b[i], c8756j.f20447b.f20444b[i]) && AbstractC8827z.m21386a(this.f20449d[i], c8756j.f20449d[i]);
    }
}
