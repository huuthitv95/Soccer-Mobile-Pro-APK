package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.U2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6122U2 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-89, -39, -39, -89, -39, -88, -40, -84, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, Ascii.f22490CR, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, Ascii.f22500SO, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C6746eB A00() {
        return new C6746eB();
    }

    public static C6745eA A01(C6898ge c6898ge) {
        return new C6745eA(c6898ge);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC6367Y4.A01.execute(new C6747eC(initListener, initResult));
    }

    public static void A06(C6898ge c6898ge) {
        if (AbstractC6173Ur.A0P(c6898ge) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C6088TT(Thread.getDefaultUncaughtExceptionHandler(), c6898ge, new C6679d6());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c6898ge.A08().ABC(A02(198, 7, 78), AbstractC6098Td.A1X, new C6099Te(e));
            }
        }
    }

    public static void A07(C6898ge c6898ge) {
        A0H(c6898ge, null, null, 3);
    }

    public static void A08(C6898ge c6898ge) {
        A0H(c6898ge, null, null, 3);
    }

    public static void A09(C6898ge c6898ge) {
        if (C6171Up.A2O(c6898ge)) {
            A0F(c6898ge, 0);
        }
        if (C6171Up.A2X(c6898ge)) {
            A0B(c6898ge);
        }
    }

    public static void A0A(C6898ge c6898ge) {
        if (C6171Up.A2P(c6898ge)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c6898ge, null, 3);
        }
    }

    public static void A0B(C6898ge c6898ge) {
        ExecutorC6379YG.A06.execute(new C6748eD(c6898ge));
    }

    public static void A0C(C6898ge c6898ge) {
        AbstractC5779OP.A02(c6898ge);
        C6092TX.A0C(c6898ge, new C6649cc(c6898ge), new C6798f2(), BuildConfigApi.isDebug());
        c6898ge.A0A();
        A0D(c6898ge);
    }

    public static void A0D(C6898ge c6898ge) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c6898ge);
        String string = sharedPreferences.getString(A02(186, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            InterfaceC6097Tc interfaceC6097TcA08 = c6898ge.A08();
            C6099Te c6099Te = new C6099Te(string2);
            String flashConfig = A02(181, 5, 63);
            interfaceC6097TcA08.ABz(flashConfig, 3701, c6099Te);
        }
    }

    public static void A0F(C6898ge c6898ge, int i) {
        AbstractC6066T7.A01(c6898ge);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC6240Vy.A02();
        }
        A06(c6898ge);
        AbstractC6282Wf.A00(C6171Up.A0q(c6898ge), BuildConfigApi.isDebug(), A00(), A01(c6898ge));
        C6041Si.A03(C6171Up.A04(c6898ge));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C6871gD.A09(new C6736e1(c6898ge));
        }
        if (i == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c6898ge.A08().ABz(A02(178, 3, 6), AbstractC6098Td.A0R, new C6099Te(A02(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 24, 67)));
        }
        ActivityUtils.A04(c6898ge, AudienceNetworkActivity.class);
        ExecutorC6379YG.A05(c6898ge);
        C6203VL.A05(c6898ge);
        C5700N8.A01(c6898ge);
        if (C6171Up.A16(c6898ge)) {
            AbstractC5969RX.A00(c6898ge);
        }
        if (C6171Up.A1z(c6898ge)) {
            C6452ZR.A02().A90(c6898ge);
        }
    }

    public static void A0G(C6898ge c6898ge, AudienceNetworkAds.InitListener initListener, int i) {
        AbstractC6066T7.A01(c6898ge);
        boolean z = false;
        synchronized (C6122U2.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                } else {
                    A00 = true;
                    z = true;
                }
            }
        }
        if (z) {
            A0F(c6898ge, i);
            ExecutorC6379YG.A08.execute(new C6773ed(c6898ge, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String strA02 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new C6121U1(true, strA02));
            } else {
                Log.w(A02(8, 17, 99), strA02);
            }
        }
    }

    public static void A0H(C6898ge c6898ge, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        AbstractC6240Vy.A05(A02(205, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        C6871gD.A06();
        A0G(c6898ge, initListener, i);
    }

    public static synchronized boolean A0I() {
        return A00;
    }
}
