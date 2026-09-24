package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8642g implements InterfaceC8643h {

    /* JADX INFO: renamed from: a */
    public final List f19949a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8629r[] f19950b;

    /* JADX INFO: renamed from: c */
    public boolean f19951c;

    /* JADX INFO: renamed from: d */
    public int f19952d;

    /* JADX INFO: renamed from: e */
    public int f19953e;

    /* JADX INFO: renamed from: f */
    public long f19954f;

    public C8642g(List list) {
        this.f19949a = list;
        this.f19950b = new InterfaceC8629r[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        this.f19951c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        for (int i = 0; i < this.f19950b.length; i++) {
            C8635c0 c8635c0 = (C8635c0) this.f19949a.get(i);
            c8639e0.m21174a();
            c8639e0.m21175b();
            C8538g c8538gMo21092a = interfaceC8568j.mo21092a(c8639e0.f19936d, 3);
            c8639e0.m21175b();
            c8538gMo21092a.mo21053a(new C8708o(c8639e0.f19937e, null, "application/dvbsubs", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, c8635c0.f19908a, -1, Long.MAX_VALUE, Collections.singletonList(c8635c0.f19909b), null, null));
            this.f19950b[i] = c8538gMo21092a;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21167a(C8815n c8815n) {
        boolean z;
        boolean z2;
        if (this.f19951c) {
            if (this.f19952d == 2) {
                if (c8815n.f20645c - c8815n.f20644b == 0) {
                    z2 = false;
                } else {
                    if (c8815n.m21352j() != 32) {
                        this.f19951c = false;
                    }
                    this.f19952d--;
                    z2 = this.f19951c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f19952d == 1) {
                if (c8815n.f20645c - c8815n.f20644b == 0) {
                    z = false;
                } else {
                    if (c8815n.m21352j() != 0) {
                        this.f19951c = false;
                    }
                    this.f19952d--;
                    z = this.f19951c;
                }
                if (!z) {
                    return;
                }
            }
            int i = c8815n.f20644b;
            int i2 = c8815n.f20645c - i;
            for (InterfaceC8629r interfaceC8629r : this.f19950b) {
                c8815n.m21347e(i);
                interfaceC8629r.mo21049a(i2, c8815n);
            }
            this.f19953e += i2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        if (z) {
            this.f19951c = true;
            this.f19954f = j;
            this.f19953e = 0;
            this.f19952d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
        if (this.f19951c) {
            for (InterfaceC8629r interfaceC8629r : this.f19950b) {
                interfaceC8629r.mo21051a(this.f19954f, 1, this.f19953e, 0, null);
            }
            this.f19951c = false;
        }
    }
}
