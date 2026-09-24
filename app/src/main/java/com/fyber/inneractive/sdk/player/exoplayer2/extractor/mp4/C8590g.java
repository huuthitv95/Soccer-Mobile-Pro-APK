package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8590g implements InterfaceC8588e {

    /* JADX INFO: renamed from: a */
    public final int f19634a;

    /* JADX INFO: renamed from: b */
    public final int f19635b;

    /* JADX INFO: renamed from: c */
    public final C8815n f19636c;

    public C8590g(C8585b c8585b) {
        C8815n c8815n = c8585b.f19527P0;
        this.f19636c = c8815n;
        c8815n.m21347e(12);
        this.f19634a = c8815n.m21355m();
        this.f19635b = c8815n.m21355m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC8588e
    /* JADX INFO: renamed from: a */
    public final int mo21125a() {
        return this.f19635b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC8588e
    /* JADX INFO: renamed from: b */
    public final int mo21126b() {
        int i = this.f19634a;
        return i == 0 ? this.f19636c.m21355m() : i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC8588e
    /* JADX INFO: renamed from: c */
    public final boolean mo21127c() {
        return this.f19634a != 0;
    }
}
