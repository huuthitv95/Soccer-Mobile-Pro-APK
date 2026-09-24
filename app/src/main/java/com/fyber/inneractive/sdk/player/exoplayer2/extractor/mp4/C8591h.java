package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8591h implements InterfaceC8588e {

    /* JADX INFO: renamed from: a */
    public final C8815n f19637a;

    /* JADX INFO: renamed from: b */
    public final int f19638b;

    /* JADX INFO: renamed from: c */
    public final int f19639c;

    /* JADX INFO: renamed from: d */
    public int f19640d;

    /* JADX INFO: renamed from: e */
    public int f19641e;

    public C8591h(C8585b c8585b) {
        C8815n c8815n = c8585b.f19527P0;
        this.f19637a = c8815n;
        c8815n.m21347e(12);
        this.f19639c = c8815n.m21355m() & 255;
        this.f19638b = c8815n.m21355m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC8588e
    /* JADX INFO: renamed from: a */
    public final int mo21125a() {
        return this.f19638b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC8588e
    /* JADX INFO: renamed from: b */
    public final int mo21126b() {
        int i = this.f19639c;
        if (i == 8) {
            return this.f19637a.m21352j();
        }
        if (i == 16) {
            return this.f19637a.m21357o();
        }
        int i2 = this.f19640d;
        this.f19640d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f19641e & 15;
        }
        int iM21352j = this.f19637a.m21352j();
        this.f19641e = iM21352j;
        return (iM21352j & 240) >> 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC8588e
    /* JADX INFO: renamed from: c */
    public final boolean mo21127c() {
        return false;
    }
}
