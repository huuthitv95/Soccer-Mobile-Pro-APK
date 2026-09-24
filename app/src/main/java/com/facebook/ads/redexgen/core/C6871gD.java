package com.facebook.ads.redexgen.core;

import android.provider.Settings;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6871gD {
    public static InterfaceC6851ft A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, Ascii.f22491EM, 51, Ascii.DC2, 114, 47, Ascii.CAN, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, Ascii.NAK, 47, 51, 43, 125, 74, 63, 96, 71, 122, 102, 66, 127, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, 127, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, 127, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, Ascii.f22491EM, 88, 115, 98, 97, 121, 100, 125, 127, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, 127, 120, 127, 98, 55, 83, 81, 83, 66, Base64.padSymbol, 106, 101, 81, 105, 111, SignedBytes.MAX_POWER_OF_TWO, 109, 32, 127, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, Ascii.f22499SI, 7, Ascii.f22493FS, Ascii.f22498RS, 2, Ascii.f22499SI, 0, Ascii.f22503VT, 49, 3, 1, 10, Ascii.f22503VT, 49, 1, 0, Ascii.f22494GS, Ascii.SYN, 7, 4, Ascii.f22493FS, 1, Ascii.CAN, 33, 58, Ascii.f22499SI, 103, Ascii.DC2, 7, 59, 7, 63, Ascii.SYN, 108, 5, 96, 3, 3, 0, 49, Ascii.SYN, 37, Ascii.SUB, 39, 19, Ascii.f22494GS, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(168, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC6853fv A00(C6067T8 c6067t8) {
        return A03(true, c6067t8);
    }

    public static InterfaceC6853fv A01(C6067T8 c6067t8) {
        return A02(true, c6067t8);
    }

    public static InterfaceC6853fv A02(boolean z, C6067T8 c6067t8) {
        C6857fz c6857fz = new C6857fz();
        C6860g2 networkModuleRequestConfigurationBuilder = A04(c6067t8);
        if (!A0B(c6067t8)) {
            c6857fz.A02(A03);
            c6857fz.A01(A02);
        }
        if (C6314XD.A04()) {
            networkModuleRequestConfigurationBuilder.A08(C6314XD.A02());
        }
        C5070Cv c5070CvA00 = AbstractC6855fx.A00();
        C6857fz networkModuleConfigurationBuilder = c6857fz.A00(networkModuleRequestConfigurationBuilder.A09());
        return c5070CvA00.A00(networkModuleConfigurationBuilder.A03(z).A04(c6067t8.A05().AAO()).A05(), c6067t8.A08(), ExecutorC6379YG.A01());
    }

    public static InterfaceC6853fv A03(boolean z, C6067T8 c6067t8) {
        return AbstractC6855fx.A00().A00(new C6857fz().A03(z).A00(A04(c6067t8).A09()).A04(c6067t8.A05().AAO()).A05(), c6067t8.A08(), ExecutorC6379YG.A01());
    }

    public static C6860g2 A04(C6067T8 c6067t8) {
        A08(c6067t8);
        C6860g2 c6860g2 = new C6860g2();
        if (A0B(c6067t8) || C6314XD.A04()) {
            c6860g2.A02(360000).A04(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        } else {
            c6860g2.A02(C6171Up.A09(c6067t8)).A04(C6171Up.A0B(c6067t8));
        }
        c6860g2.A03(C6171Up.A0A(c6067t8)).A05(C6171Up.A0C(c6067t8)).A06(C6171Up.A0D(c6067t8));
        synchronized (C6871gD.class) {
            if (A00 != null && (A00 instanceof InterfaceC6851ft)) {
                c6860g2.A07(A00);
            }
        }
        return c6860g2;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(C6067T8 c6067t8) {
        if (!A04.get()) {
            c6067t8.A08().ABC(A05(161, 7, 110), AbstractC6098Td.A21, new C6099Te(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC6851ft interfaceC6851ft) {
        A00 = interfaceC6851ft;
    }

    public static boolean A0A(C6067T8 c6067t8) {
        return Settings.Global.getInt(c6067t8.getContentResolver(), A05(145, 16, 115), 0) != 0;
    }

    public static boolean A0B(C6067T8 c6067t8) {
        String strA9Q = c6067t8.A05().A9Q();
        if (!TextUtils.isEmpty(strA9Q)) {
            String urlPrefix = A05(3, 3, 58);
            if (!strA9Q.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (strA9Q.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
