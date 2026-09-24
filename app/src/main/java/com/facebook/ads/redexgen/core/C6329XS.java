package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6329XS {
    public static String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC7077jd A02;
    public final C6902gi A03;
    public final InterfaceC6327XQ A04;

    public C6329XS(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, InterfaceC6327XQ interfaceC6327XQ) {
        this.A03 = c6902gi;
        this.A04 = interfaceC6327XQ;
        this.A02 = abstractC7077jd;
    }

    public static C6329XS A00(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, InterfaceC6327XQ interfaceC6327XQ) {
        Object creativeAsCtaLoggingHelper = c6902gi.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new C6329XS(c6902gi, abstractC7077jd, interfaceC6327XQ);
            c6902gi.A0P(creativeAsCtaLoggingHelper);
        }
        return (C6329XS) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(C6902gi c6902gi) {
        return C6171Up.A1g(c6902gi) && C6307X6.A0I(c6902gi);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final C6328XR A02(AbstractC7077jd abstractC7077jd) {
        boolean z;
        if (C6171Up.A1m(this.A03)) {
            z = abstractC7077jd.A1e() && A01(this.A03);
            return new C6328XR(z, z);
        }
        boolean zA1e = abstractC7077jd.A1e();
        if (zA1e) {
            boolean zA01 = A01(this.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
            z = zA01;
        }
        return new C6328XR(zA1e, z);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
