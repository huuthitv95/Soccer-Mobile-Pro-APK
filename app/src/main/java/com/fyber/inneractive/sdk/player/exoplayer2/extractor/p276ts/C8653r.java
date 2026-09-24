package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C8653r {

    /* JADX INFO: renamed from: a */
    public final int f20066a;

    /* JADX INFO: renamed from: b */
    public boolean f20067b;

    /* JADX INFO: renamed from: c */
    public boolean f20068c;

    /* JADX INFO: renamed from: d */
    public byte[] f20069d;

    /* JADX INFO: renamed from: e */
    public int f20070e;

    public C8653r(int i) {
        this.f20066a = i;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f20069d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m21181a(byte[] bArr, int i, int i2) {
        if (this.f20067b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f20069d;
            int length = bArr2.length;
            int i4 = this.f20070e + i3;
            if (length < i4) {
                this.f20069d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f20069d, this.f20070e, i3);
            this.f20070e += i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21182a(int i) {
        if (!this.f20067b) {
            return false;
        }
        this.f20070e -= i;
        this.f20067b = false;
        this.f20068c = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m21183b(int i) {
        if (this.f20067b) {
            throw new IllegalStateException();
        }
        boolean z = i == this.f20066a;
        this.f20067b = z;
        if (z) {
            this.f20070e = 3;
            this.f20068c = false;
        }
    }
}
