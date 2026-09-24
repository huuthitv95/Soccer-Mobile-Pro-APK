package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7172lD implements InterfaceC5323H1 {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C45944v A00;
    public final C460253 A01;

    public C7172lD(C460253 c460253) {
        this.A01 = c460253;
        this.A00 = new C45944v();
    }

    private C5321Gz A00(C45944v c45944v, long scrValue, long scrTimeUs) {
        int iA09 = -1;
        int iA010 = -1;
        long j = -9223372036854775807L;
        while (c45944v.A07() >= 4) {
            if (C7171lC.A00(c45944v.A0l(), c45944v.A09()) != 442) {
                c45944v.A0g(1);
            } else {
                c45944v.A0g(4);
                long jA06 = C5575L6.A06(c45944v);
                if (jA06 != -9223372036854775807L) {
                    long jA07 = this.A01.A06(jA06);
                    if (jA07 > scrValue) {
                        if (j == -9223372036854775807L) {
                            return C5321Gz.A04(jA07, scrTimeUs);
                        }
                        return C5321Gz.A03(((long) iA09) + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jA07;
                    if (lastScrTimeUsInRange > scrValue) {
                        return C5321Gz.A03(((long) c45944v.A09()) + scrTimeUs);
                    }
                    j = jA07;
                    iA09 = c45944v.A09();
                }
                A01(c45944v);
                iA010 = c45944v.A09();
            }
        }
        if (j != -9223372036854775807L) {
            return C5321Gz.A05(j, ((long) iA010) + scrTimeUs);
        }
        return C5321Gz.A03;
    }

    public static void A01(C45944v c45944v) {
        int systemHeaderLength = c45944v.A0A();
        if (c45944v.A07() < 10) {
            c45944v.A0f(systemHeaderLength);
            return;
        }
        c45944v.A0g(9);
        int limit = c45944v.A0I();
        int packStuffingLength = limit & 7;
        int limit2 = c45944v.A07();
        if (limit2 < packStuffingLength) {
            c45944v.A0f(systemHeaderLength);
            return;
        }
        c45944v.A0g(packStuffingLength);
        int limit3 = c45944v.A07();
        if (limit3 < 4) {
            c45944v.A0f(systemHeaderLength);
            return;
        }
        byte[] bArrA0l = c45944v.A0l();
        int limit4 = c45944v.A09();
        if (C7171lC.A00(bArrA0l, limit4) == 443) {
            c45944v.A0g(4);
            int packStuffingLength2 = c45944v.A0M();
            int limit5 = c45944v.A07();
            if (limit5 < packStuffingLength2) {
                c45944v.A0f(systemHeaderLength);
                return;
            }
            c45944v.A0g(packStuffingLength2);
        }
        while (limit >= 4) {
            byte[] bArrA0l2 = c45944v.A0l();
            int limit6 = c45944v.A09();
            int packStuffingLength3 = C7171lC.A00(bArrA0l2, limit6);
            if (packStuffingLength3 == 442 || packStuffingLength3 == 441 || (packStuffingLength3 >>> 8) != 1) {
                return;
            }
            c45944v.A0g(4);
            if (c45944v.A07() < 2) {
                c45944v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c45944v.A0M();
            int packStuffingLength4 = c45944v.A0A();
            int limit7 = c45944v.A09();
            c45944v.A0f(Math.min(packStuffingLength4, limit7 + nextStartCode));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5323H1
    public final void AFs() {
        this.A00.A0i(AbstractC46115C.A07);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5323H1
    public final C5321Gz AIw(InterfaceC7263ms interfaceC7263ms, long j) throws IOException {
        long jA8n = interfaceC7263ms.A8n();
        int iMin = (int) Math.min(20000L, interfaceC7263ms.A8O() - jA8n);
        this.A00.A0d(iMin);
        interfaceC7263ms.AGt(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j, jA8n);
    }
}
