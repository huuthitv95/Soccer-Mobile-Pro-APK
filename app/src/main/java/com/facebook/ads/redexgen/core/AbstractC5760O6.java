package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.O6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5760O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    public static void A02(C6902gi c6902gi, C6056Sx c6056Sx, C47707l c47707l) {
        c6056Sx.A0d(new C6054Sv(c47707l.A2C().A01(), C6739e4.A04, C6739e4.A04, c47707l.A1D(), A00(17, 14, 113)));
        boolean zA1g = c47707l.A1g();
        String strA00 = A00(17, 14, 113);
        if (zA1g) {
            C6052St c6052St = new C6052St(c47707l.A0x(), c47707l.A1D(), strA00);
            c6052St.A04 = true;
            c6052St.A03 = A00(0, 5, 66);
            c6056Sx.A0Y(c6052St);
        }
        boolean zA30 = C6171Up.A30(c6902gi, C6829fX.A03());
        C6052St c6052St2 = new C6052St(c47707l.A29().A0H().A09(), c47707l.A1D(), A00(17, 14, 113), c47707l.A29().A0H().A06());
        if (zA1g && !zA30) {
            c6056Sx.A0Y(c6052St2);
        } else {
            c6056Sx.A0b(c6052St2);
        }
        c6056Sx.A0d(new C6054Sv(c47707l.A29().A0H().A08(), AbstractC5755O1.A00(c47707l.A29().A0H()), AbstractC5755O1.A01(c47707l.A29().A0H()), c47707l.A1D(), A00(17, 14, 113)));
        AbstractC5754O0.A00(c47707l, c6056Sx, strA00);
        Iterator<String> it = c47707l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c6056Sx.A0d(new C6054Sv(url, -1, -1, c47707l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C6902gi c6902gi, C6056Sx c6056Sx, C47707l c47707l) {
        int i = 0;
        for (C5719NR c5719nr : c47707l.A2G()) {
            C6054Sv c6054Sv = new C6054Sv(c5719nr.A0H().A08(), AbstractC5755O1.A00(c5719nr.A0H()), AbstractC5755O1.A01(c5719nr.A0H()), c47707l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
            if (i == 0) {
                c6056Sx.A0c(c6054Sv);
            } else {
                c6056Sx.A0d(c6054Sv);
            }
            AbstractC5754O0.A00(c47707l, c6056Sx, A00(17, 14, 113));
            Iterator<String> it = c5719nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c6056Sx.A0d(new C6054Sv(it.next(), -1, -1, c47707l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)));
            }
            if (!TextUtils.isEmpty(c5719nr.A0H().A09())) {
                new C6052St(c5719nr.A0H().A09(), c47707l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), c5719nr.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}
