package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5987Rp {
    public static String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static InterfaceC5624Lt A00(Context context, InterfaceC6069TA interfaceC6069TA) {
        return A01(context, interfaceC6069TA, null);
    }

    public static InterfaceC5624Lt A01(Context context, InterfaceC6069TA interfaceC6069TA, String str) {
        C6898ge sdkContext = A09(context);
        InterfaceC5628Lx interfaceC5628LxA8C = interfaceC6069TA.A8C(sdkContext);
        if (interfaceC5628LxA8C != null) {
            return str != null ? interfaceC5628LxA8C.ACN(str) : interfaceC5628LxA8C.ACM();
        }
        return new C7132kX();
    }

    public static C6902gi A02(Activity activity) {
        return new C6902gi(activity, (InterfaceC6069TA) A0A(), A00(activity, A0A()));
    }

    public static C6902gi A03(Context context) {
        return new C6902gi(context, A0A(), new C7132kX());
    }

    public static C6902gi A04(Context context) {
        if (C6171Up.A0w(context)) {
            return new C6902gi(context, A0A(), A00(context, A0A()));
        }
        C6902gi c6902giA03 = A03(context);
        if (A00[2].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return c6902giA03;
    }

    public static C6902gi A05(Context context, String str) {
        InterfaceC5624Lt interfaceC5624LtA01 = A01(context, A0A(), str);
        interfaceC5624LtA01.AJT(1000);
        return new C6902gi(context, A0A(), interfaceC5624LtA01);
    }

    public static C6902gi A06(Context context, String str) {
        return new C6902gi(context, A0A(), A01(context, A0A(), str));
    }

    public static C6902gi A07(Context context, String str) {
        return new C6902gi(context, A0A(), A01(context, A0A(), str));
    }

    public static C472976 A08(Context context) {
        return new C472976(context, A0A(), A0A().A8C(A09(context)));
    }

    public static C6898ge A09(Context context) {
        return new C6898ge(context, A0A());
    }

    public static synchronized C6452ZR A0A() {
        return C6452ZR.A02();
    }
}
