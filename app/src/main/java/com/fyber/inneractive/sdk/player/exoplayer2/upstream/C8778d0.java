package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.AbstractC8560e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8562g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8778d0 implements InterfaceC8801z {

    /* JADX INFO: renamed from: a */
    public final C8786k f20523a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8783h f20524b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8763c0 f20525c;

    /* JADX INFO: renamed from: d */
    public volatile AbstractC8560e f20526d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f20527e;

    /* JADX INFO: renamed from: f */
    public volatile long f20528f;

    public C8778d0(InterfaceC8783h interfaceC8783h, Uri uri, InterfaceC8763c0 interfaceC8763c0) {
        this.f20524b = interfaceC8783h;
        this.f20523a = new C8786k(uri, 0L, 0L, -1L, null, 1);
        this.f20525c = interfaceC8763c0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: a */
    public final boolean mo21061a() {
        return this.f20527e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: b */
    public final void mo21062b() {
        this.f20527e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    public final void load() {
        C8785j c8785j = new C8785j(this.f20524b, this.f20523a);
        try {
            c8785j.f20539a.mo20829a(c8785j.f20540b);
            c8785j.f20542d = true;
            this.f20526d = ((C8562g) this.f20525c).m21104a(this.f20524b.mo20830a(), c8785j);
        } finally {
            this.f20528f = c8785j.f20544f;
            AbstractC8827z.m21384a(c8785j);
        }
    }
}
