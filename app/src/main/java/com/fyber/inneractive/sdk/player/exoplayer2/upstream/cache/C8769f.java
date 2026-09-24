package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8790o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8795t;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8782g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8769f implements InterfaceC8782g {

    /* JADX INFO: renamed from: a */
    public final C8775l f20483a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8782g f20484b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8782g f20485c;

    /* JADX INFO: renamed from: d */
    public final C8767d f20486d;

    public C8769f(C8775l c8775l, C8790o c8790o) {
        C8795t c8795t = new C8795t();
        C8767d c8767d = new C8767d(c8775l);
        this.f20483a = c8775l;
        this.f20484b = c8790o;
        this.f20485c = c8795t;
        this.f20486d = c8767d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8782g
    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h mo20831a() {
        C8775l c8775l = this.f20483a;
        InterfaceC8783h interfaceC8783hMo20831a = this.f20484b.mo20831a();
        InterfaceC8783h interfaceC8783hMo20831a2 = this.f20485c.mo20831a();
        C8767d c8767d = this.f20486d;
        return new C8768e(c8775l, interfaceC8783hMo20831a, interfaceC8783hMo20831a2, c8767d != null ? new C8766c(c8767d.f20465a) : null);
    }
}
