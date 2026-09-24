package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C8658w implements InterfaceC8641f0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8657v f20097a;

    /* JADX INFO: renamed from: b */
    public final C8815n f20098b = new C8815n(32);

    /* JADX INFO: renamed from: c */
    public int f20099c;

    /* JADX INFO: renamed from: d */
    public int f20100d;

    /* JADX INFO: renamed from: e */
    public boolean f20101e;

    /* JADX INFO: renamed from: f */
    public boolean f20102f;

    public C8658w(InterfaceC8657v interfaceC8657v) {
        this.f20097a = interfaceC8657v;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8641f0
    /* JADX INFO: renamed from: a */
    public final void mo21176a() {
        this.f20102f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8641f0
    /* JADX INFO: renamed from: a */
    public final void mo21177a(C8815n c8815n, boolean z) {
        int iM21352j = z ? c8815n.f20644b + c8815n.m21352j() : -1;
        if (this.f20102f) {
            if (!z) {
                return;
            }
            this.f20102f = false;
            c8815n.m21347e(iM21352j);
            this.f20100d = 0;
        }
        while (true) {
            int i = c8815n.f20645c - c8815n.f20644b;
            if (i <= 0) {
                return;
            }
            int i2 = this.f20100d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM21352j2 = c8815n.m21352j();
                    c8815n.m21347e(c8815n.f20644b - 1);
                    if (iM21352j2 == 255) {
                        this.f20102f = true;
                        return;
                    }
                }
                int iMin = Math.min(c8815n.f20645c - c8815n.f20644b, 3 - this.f20100d);
                c8815n.m21339a(this.f20098b.f20643a, this.f20100d, iMin);
                int i3 = this.f20100d + iMin;
                this.f20100d = i3;
                if (i3 == 3) {
                    this.f20098b.m21343c(3);
                    C8815n c8815n2 = this.f20098b;
                    c8815n2.m21347e(c8815n2.f20644b + 1);
                    int iM21352j3 = this.f20098b.m21352j();
                    int iM21352j4 = this.f20098b.m21352j();
                    this.f20101e = (iM21352j3 & 128) != 0;
                    this.f20099c = (((iM21352j3 & 15) << 8) | iM21352j4) + 3;
                    int iM21337a = this.f20098b.m21337a();
                    int i4 = this.f20099c;
                    if (iM21337a < i4) {
                        C8815n c8815n3 = this.f20098b;
                        byte[] bArr = c8815n3.f20643a;
                        c8815n3.m21343c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f20098b.f20643a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i, this.f20099c - i2);
                c8815n.m21339a(this.f20098b.f20643a, this.f20100d, iMin2);
                int i5 = this.f20100d + iMin2;
                this.f20100d = i5;
                int i6 = this.f20099c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f20101e) {
                        byte[] bArr2 = this.f20098b.f20643a;
                        int i7 = -1;
                        for (int i8 = 0; i8 < i6; i8++) {
                            i7 = AbstractC8827z.f20678h[((i7 >>> 24) ^ (bArr2[i8] & 255)) & 255] ^ (i7 << 8);
                        }
                        int i9 = AbstractC8827z.f20671a;
                        if (i7 != 0) {
                            this.f20102f = true;
                            return;
                        }
                        this.f20098b.m21343c(this.f20099c - 4);
                    } else {
                        this.f20098b.m21343c(i6);
                    }
                    this.f20097a.mo21163a(this.f20098b);
                    this.f20100d = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8641f0
    /* JADX INFO: renamed from: a */
    public final void mo21178a(C8823v c8823v, InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        this.f20097a.mo21164a(c8823v, interfaceC8568j, c8639e0);
        this.f20102f = true;
    }
}
