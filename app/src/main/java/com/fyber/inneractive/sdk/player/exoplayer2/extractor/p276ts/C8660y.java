package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C8660y implements InterfaceC8657v {

    /* JADX INFO: renamed from: a */
    public C8823v f20105a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8629r f20106b;

    /* JADX INFO: renamed from: c */
    public boolean f20107c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8657v
    /* JADX INFO: renamed from: a */
    public final void mo21163a(C8815n c8815n) {
        long j;
        long j2;
        long j3;
        long j4 = -9223372036854775807L;
        if (!this.f20107c) {
            C8823v c8823v = this.f20105a;
            long j5 = 0;
            if (c8823v.f20667a == Long.MAX_VALUE) {
                j2 = 0;
            } else {
                j2 = c8823v.f20669c == -9223372036854775807L ? -9223372036854775807L : c8823v.f20668b;
            }
            if (j2 == -9223372036854775807L) {
                return;
            }
            InterfaceC8629r interfaceC8629r = this.f20106b;
            C8823v c8823v2 = this.f20105a;
            if (c8823v2.f20667a == Long.MAX_VALUE) {
                j3 = j5;
            } else if (c8823v2.f20669c == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j5 = c8823v2.f20668b;
                j3 = j5;
            }
            interfaceC8629r.mo21053a(new C8708o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j3, null, null, null));
            this.f20107c = true;
        }
        int i = c8815n.f20645c - c8815n.f20644b;
        this.f20106b.mo21049a(i, c8815n);
        InterfaceC8629r interfaceC8629r2 = this.f20106b;
        C8823v c8823v3 = this.f20105a;
        if (c8823v3.f20669c == -9223372036854775807L) {
            long j6 = c8823v3.f20667a;
            if (j6 != Long.MAX_VALUE) {
                j = j6;
            }
            interfaceC8629r2.mo21051a(j, 1, i, 0, null);
        }
        j4 = c8823v3.f20669c;
        j = j4;
        interfaceC8629r2.mo21051a(j, 1, i, 0, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8657v
    /* JADX INFO: renamed from: a */
    public final void mo21164a(C8823v c8823v, InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        this.f20105a = c8823v;
        c8639e0.m21174a();
        c8639e0.m21175b();
        C8538g c8538gMo21092a = interfaceC8568j.mo21092a(c8639e0.f19936d, 4);
        this.f20106b = c8538gMo21092a;
        c8639e0.m21175b();
        c8538gMo21092a.mo21053a(C8708o.m21266a(c8639e0.f19937e, "application/x-scte35", (C8524d) null));
    }
}
