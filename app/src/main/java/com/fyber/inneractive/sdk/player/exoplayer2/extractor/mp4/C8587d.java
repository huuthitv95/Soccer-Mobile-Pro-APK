package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8587d {

    /* JADX INFO: renamed from: a */
    public final int f19621a;

    /* JADX INFO: renamed from: b */
    public int f19622b;

    /* JADX INFO: renamed from: c */
    public int f19623c;

    /* JADX INFO: renamed from: d */
    public long f19624d;

    /* JADX INFO: renamed from: e */
    public final boolean f19625e;

    /* JADX INFO: renamed from: f */
    public final C8815n f19626f;

    /* JADX INFO: renamed from: g */
    public final C8815n f19627g;

    /* JADX INFO: renamed from: h */
    public int f19628h;

    /* JADX INFO: renamed from: i */
    public int f19629i;

    public C8587d(C8815n c8815n, C8815n c8815n2, boolean z) {
        this.f19627g = c8815n;
        this.f19626f = c8815n2;
        this.f19625e = z;
        c8815n2.m21347e(12);
        this.f19621a = c8815n2.m21355m();
        c8815n.m21347e(12);
        this.f19629i = c8815n.m21355m();
        if (!(c8815n.m21340b() == 1)) {
            throw new IllegalStateException("first_chunk must be 1");
        }
        this.f19622b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21124a() {
        int i = this.f19622b + 1;
        this.f19622b = i;
        if (i == this.f19621a) {
            return false;
        }
        this.f19624d = this.f19625e ? this.f19626f.m21356n() : this.f19626f.m21353k();
        if (this.f19622b == this.f19628h) {
            this.f19623c = this.f19627g.m21355m();
            C8815n c8815n = this.f19627g;
            c8815n.m21347e(c8815n.f20644b + 4);
            int i2 = this.f19629i - 1;
            this.f19629i = i2;
            this.f19628h = i2 > 0 ? this.f19627g.m21355m() - 1 : -1;
        }
        return true;
    }
}
