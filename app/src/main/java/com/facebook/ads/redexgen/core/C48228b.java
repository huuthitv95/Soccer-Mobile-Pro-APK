package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8b */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48228b implements InterfaceC7236mF {
    public long A00;
    public final long A01;
    public final C45804h A03 = new C45804h();
    public final C45804h A02 = new C45804h();

    public C48228b(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j3;
        this.A03.A04(0L);
        this.A02.A04(j2);
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(long j, long j2) {
        if (A02(j)) {
            return;
        }
        this.A03.A04(j);
        this.A02.A04(j2);
    }

    public final boolean A02(long j) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j - lastIndexedTimeUs < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7236mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final C5355HX A91(long j) {
        int iA0C = AbstractC46115C.A0C(this.A03, j, true, true);
        C5357HZ c5357hz = new C5357HZ(this.A03.A03(iA0C), this.A02.A03(iA0C));
        if (c5357hz.A01 != j) {
            int targetIndex = this.A03.A02();
            if (iA0C != targetIndex - 1) {
                int targetIndex2 = iA0C + 1;
                long jA03 = this.A03.A03(targetIndex2);
                int targetIndex3 = iA0C + 1;
                C5357HZ nextSeekPoint = new C5357HZ(jA03, this.A02.A03(targetIndex3));
                return new C5355HX(c5357hz, nextSeekPoint);
            }
        }
        return new C5355HX(c5357hz);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7236mF
    public final long A9H(long j) {
        return this.A03.A03(AbstractC46115C.A0C(this.A02, j, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final boolean AAj() {
        return true;
    }
}
