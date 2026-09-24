package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6508aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC6512aP A00(AbstractC7077jd abstractC7077jd) {
        if (abstractC7077jd.A2U()) {
            EnumC6512aP enumC6512aP = EnumC6512aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC6512aP;
        }
        return EnumC6512aP.A03;
    }

    public static void A01(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        c6902gi.A0F().AAz(enumC6509aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        c6902gi.A0F().AB9(enumC6509aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        c6902gi.A0F().AC7(enumC6509aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        A01(c6902gi, enumC6509aM);
    }

    public static void A05(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        A02(c6902gi, enumC6509aM);
    }

    public static void A06(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        A03(c6902gi, enumC6509aM);
    }

    public static void A07(C6200VI c6200vi, C6902gi c6902gi, InterfaceC6406Yh interfaceC6406Yh, AbstractC7077jd abstractC7077jd, EnumC6509aM enumC6509aM) {
        if (c6200vi != null) {
            c6200vi.A04(EnumC6199VH.A0A, null);
        }
        if (abstractC7077jd.A2Q()) {
            c6902gi.A0F().AB8(enumC6509aM.name().toLowerCase(Locale.US));
        }
        if (abstractC7077jd.A2U()) {
            c6902gi.A0F().AAy(enumC6509aM.name().toLowerCase(Locale.US));
        }
        C5796Og c5796OgA00 = AbstractC5797Oh.A00(c6902gi.A02());
        C6898ge c6898geA02 = c6902gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c5796OgA00.A0O(c6898geA02, true)) {
            if (interfaceC6406Yh != null) {
                interfaceC6406Yh.AAo(abstractC7077jd.A2E(), abstractC7077jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC7077jd.A2C().A00())) {
                return;
            }
            C6307X6.A0O(new C6307X6(), c6902gi, AbstractC6312XB.A00(abstractC7077jd.A2C().A00()), abstractC7077jd.A2E());
        }
    }
}
