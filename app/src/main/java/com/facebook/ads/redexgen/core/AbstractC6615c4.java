package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6615c4 {
    public static String[] A00 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static AbstractC6614c3 A00(C6618c7 c6618c7, Bundle bundle, boolean z) {
        AbstractC6614c3 c5537ku;
        c6618c7.A06().A0H().A00(false);
        C5719NR c5719nrA29 = c6618c7.A05().A29();
        double dA00 = AbstractC6605bu.A00(c5719nrA29);
        boolean isWatchAndBrowse = c6618c7.A05().A29().A0T();
        boolean zA06 = AbstractC6605bu.A06(c6618c7.A00(), c6618c7.A01(), dA00);
        AbstractC5686Mt abstractC5686MtA00 = C5687Mu.A00(c6618c7.A06(), c6618c7.A07(), "", AbstractC6312XB.A00(c6618c7.A05().A29().A0J().A05()), new HashMap(), c6618c7.A05().A2A());
        boolean z2 = !TextUtils.isEmpty(c5719nrA29.A0H().A09());
        if (C6171Up.A1z(c6618c7.A06())) {
            C6902gi c6902giA06 = c6618c7.A06();
            String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            c6902giA06.A0B().AKn(c6618c7.A02(), c6618c7.A05().A2E(), z2);
        }
        if (isWatchAndBrowse && (abstractC5686MtA00 instanceof C478984)) {
            c5537ku = A01(c6618c7) ? new C5489Ji(c6618c7) : new C5521KE(c6618c7);
        } else if (z2) {
            c5537ku = new C46786H(c6618c7);
        } else {
            if (c6618c7.A05().A1c()) {
                return new C5545Kc(c6618c7);
            }
            if (c6618c7.A05().A1j()) {
                c5537ku = new C46816K(c6618c7);
            } else if (C6171Up.A2i(c6618c7.A06())) {
                c5537ku = new C46806J(c6618c7, zA06);
            } else if (zA06) {
                c5537ku = new C5542KZ(c6618c7, c6618c7.A00() == 2);
            } else {
                c5537ku = new C5537KU(c6618c7, AbstractC6605bu.A04(dA00));
            }
        }
        if (z) {
            c5537ku.A1H(c5719nrA29, c6618c7.A05().A2E(), dA00, bundle);
        }
        return c5537ku;
    }

    public static boolean A01(C6618c7 c6618c7) {
        if (!c6618c7.A05().A1y()) {
            boolean zA1c = c6618c7.A05().A1c();
            String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[5] = "BfXu055milBajq8QiXDIPY7ZZDWb7rZy";
            strArr2[7] = "zfsTxDhfKJjHYbZVz1DIv6IoDbSXcVhK";
            if (!zA1c) {
                return false;
            }
        }
        return true;
    }
}
