package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8651p implements InterfaceC8643h {

    /* JADX INFO: renamed from: a */
    public final C8815n f20048a = new C8815n(10);

    /* JADX INFO: renamed from: b */
    public InterfaceC8629r f20049b;

    /* JADX INFO: renamed from: c */
    public boolean f20050c;

    /* JADX INFO: renamed from: d */
    public long f20051d;

    /* JADX INFO: renamed from: e */
    public int f20052e;

    /* JADX INFO: renamed from: f */
    public int f20053f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        this.f20050c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        C8538g c8538gMo21092a = interfaceC8568j.mo21092a(c8639e0.f19936d, 4);
        this.f20049b = c8538gMo21092a;
        c8639e0.m21175b();
        c8538gMo21092a.mo21053a(C8708o.m21266a(c8639e0.f19937e, "application/id3", (C8524d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21167a(C8815n c8815n) {
        if (this.f20050c) {
            int i = c8815n.f20645c - c8815n.f20644b;
            int i2 = this.f20053f;
            if (i2 < 10) {
                int iMin = Math.min(i, 10 - i2);
                System.arraycopy(c8815n.f20643a, c8815n.f20644b, this.f20048a.f20643a, this.f20053f, iMin);
                if (this.f20053f + iMin == 10) {
                    this.f20048a.m21347e(0);
                    if (73 != this.f20048a.m21352j() || 68 != this.f20048a.m21352j() || 51 != this.f20048a.m21352j()) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f20050c = false;
                        return;
                    } else {
                        C8815n c8815n2 = this.f20048a;
                        c8815n2.m21347e(c8815n2.f20644b + 3);
                        this.f20052e = this.f20048a.m21351i() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i, this.f20052e - this.f20053f);
            this.f20049b.mo21049a(iMin2, c8815n);
            this.f20053f += iMin2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        if (z) {
            this.f20050c = true;
            this.f20051d = j;
            this.f20052e = 0;
            this.f20053f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
        int i;
        if (this.f20050c && (i = this.f20052e) != 0 && this.f20053f == i) {
            this.f20049b.mo21051a(this.f20051d, 1, i, 0, null);
            this.f20050c = false;
        }
    }
}
