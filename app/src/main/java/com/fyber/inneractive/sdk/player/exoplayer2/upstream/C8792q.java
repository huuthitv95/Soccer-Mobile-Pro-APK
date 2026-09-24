package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8792q implements InterfaceC8782g {

    /* JADX INFO: renamed from: b */
    public final String f20587b;

    /* JADX INFO: renamed from: c */
    public final C8788m f20588c;

    /* JADX INFO: renamed from: a */
    public final C8798w f20586a = new C8798w();

    /* JADX INFO: renamed from: d */
    public final int f20589d = 2000;

    /* JADX INFO: renamed from: e */
    public final int f20590e = 2000;

    /* JADX INFO: renamed from: f */
    public final boolean f20591f = true;

    public C8792q(String str, C8788m c8788m) {
        this.f20587b = str;
        this.f20588c = c8788m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8782g
    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h mo20831a() {
        return new C8791p(this.f20587b, this.f20588c, this.f20589d, this.f20590e, this.f20591f, this.f20586a);
    }
}
