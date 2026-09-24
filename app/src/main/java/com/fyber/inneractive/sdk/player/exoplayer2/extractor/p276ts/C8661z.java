package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8814m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C8661z implements InterfaceC8657v {

    /* JADX INFO: renamed from: a */
    public final C8814m f20108a = new C8814m(new byte[4]);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8633b0 f20109b;

    public C8661z(C8633b0 c8633b0) {
        this.f20109b = c8633b0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8657v
    /* JADX INFO: renamed from: a */
    public final void mo21163a(C8815n c8815n) {
        if (c8815n.m21352j() != 0) {
            return;
        }
        c8815n.m21347e(c8815n.f20644b + 7);
        int i = (c8815n.f20645c - c8815n.f20644b) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            C8814m c8814m = this.f20108a;
            c8815n.m21339a(c8814m.f20639a, 0, 4);
            c8814m.m21334b(0);
            int iM21332a = this.f20108a.m21332a(16);
            this.f20108a.m21336c(3);
            if (iM21332a == 0) {
                this.f20108a.m21336c(13);
            } else {
                int iM21332a2 = this.f20108a.m21332a(13);
                C8633b0 c8633b0 = this.f20109b;
                c8633b0.f19897f.put(iM21332a2, new C8658w(new C8631a0(c8633b0, iM21332a2)));
                this.f20109b.f19900i++;
            }
        }
        C8633b0 c8633b1 = this.f20109b;
        if (c8633b1.f19892a != 2) {
            c8633b1.f19897f.remove(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8657v
    /* JADX INFO: renamed from: a */
    public final void mo21164a(C8823v c8823v, InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
    }
}
