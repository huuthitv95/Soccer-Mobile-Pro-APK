package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.AbstractC8717a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8542c extends AbstractC8717a {

    /* JADX INFO: renamed from: i */
    public byte[] f19195i;

    /* JADX INFO: renamed from: j */
    public int f19196j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f19197k;

    /* JADX INFO: renamed from: l */
    public final String f19198l;

    /* JADX INFO: renamed from: m */
    public byte[] f19199m;

    public C8542c(InterfaceC8783h interfaceC8783h, C8786k c8786k, C8708o c8708o, int i, Object obj, byte[] bArr, String str) {
        super(3, i, -9223372036854775807L, -9223372036854775807L, c8708o, interfaceC8783h, c8786k, obj);
        this.f19195i = bArr;
        this.f19198l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: a */
    public final boolean mo21061a() {
        return this.f19197k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: b */
    public final void mo21062b() {
        this.f19197k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.AbstractC8717a
    /* JADX INFO: renamed from: c */
    public final long mo21063c() {
        return this.f19196j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    public final void load() {
        try {
            this.f20340h.mo20829a(this.f20333a);
            int i = 0;
            this.f19196j = 0;
            while (i != -1 && !this.f19197k) {
                byte[] bArr = this.f19195i;
                if (bArr == null) {
                    this.f19195i = new byte[16384];
                } else if (bArr.length < this.f19196j + 16384) {
                    this.f19195i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f20340h.read(this.f19195i, this.f19196j, 16384);
                if (i != -1) {
                    this.f19196j += i;
                }
            }
            if (!this.f19197k) {
                this.f19199m = Arrays.copyOf(this.f19195i, this.f19196j);
            }
        } finally {
            AbstractC8827z.m21383a(this.f20340h);
        }
    }
}
