package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8787l implements InterfaceC8760b {

    /* JADX INFO: renamed from: b */
    public int f20552b;

    /* JADX INFO: renamed from: c */
    public int f20553c;

    /* JADX INFO: renamed from: d */
    public int f20554d = 0;

    /* JADX INFO: renamed from: e */
    public C8758a[] f20555e = new C8758a[100];

    /* JADX INFO: renamed from: a */
    public final C8758a[] f20551a = new C8758a[1];

    /* JADX INFO: renamed from: a */
    public final synchronized void m21307a() {
        int i = this.f20552b;
        int i2 = AbstractC8827z.f20671a;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.f20553c);
        int i3 = this.f20554d;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.f20555e, iMax, i3, (Object) null);
        this.f20554d = iMax;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m21308a(int i) {
        boolean z = i < this.f20552b;
        this.f20552b = i;
        if (z) {
            m21307a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m21309a(C8758a[] c8758aArr) {
        int i = this.f20554d;
        int length = c8758aArr.length + i;
        C8758a[] c8758aArr2 = this.f20555e;
        if (length >= c8758aArr2.length) {
            this.f20555e = (C8758a[]) Arrays.copyOf(c8758aArr2, Math.max(c8758aArr2.length * 2, i + c8758aArr.length));
        }
        for (C8758a c8758a : c8758aArr) {
            byte[] bArr = c8758a.f20450a;
            if (bArr != null && bArr.length != 65536) {
                throw new IllegalArgumentException();
            }
            C8758a[] c8758aArr3 = this.f20555e;
            int i2 = this.f20554d;
            this.f20554d = i2 + 1;
            c8758aArr3[i2] = c8758a;
        }
        this.f20553c -= c8758aArr.length;
        notifyAll();
    }
}
