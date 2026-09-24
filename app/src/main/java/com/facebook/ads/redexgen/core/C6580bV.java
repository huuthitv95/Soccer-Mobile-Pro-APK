package com.facebook.ads.redexgen.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6580bV {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public InterfaceC5684Mr A00;
    public AbstractC5686Mt A01;
    public AbstractC7077jd A02;
    public C6329XS A03;
    public InterfaceC6344Xh A04;
    public InterfaceC6579bU A05;
    public boolean A06;
    public final C5734Ng A07;
    public final C6902gi A08;
    public final InterfaceC6192VA A09;
    public final C6365Y2 A0A;
    public final InterfaceC6406Yh A0B;
    public final C6847fp A0C;
    public final String A0D;
    public final boolean A0E;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public C6580bV(C6902gi c6902gi, String str, C6847fp c6847fp, C6365Y2 c6365y2, InterfaceC6192VA interfaceC6192VA, C5734Ng c5734Ng) {
        this(c6902gi, str, c6847fp, c6365y2, interfaceC6192VA, c5734Ng, new C5561Ks());
    }

    public C6580bV(C6902gi c6902gi, String str, C6847fp c6847fp, C6365Y2 c6365y2, InterfaceC6192VA interfaceC6192VA, C5734Ng c5734Ng, InterfaceC6406Yh interfaceC6406Yh) {
        this.A0E = true;
        this.A08 = c6902gi;
        this.A0D = str;
        this.A0C = c6847fp;
        this.A0A = c6365y2;
        this.A09 = interfaceC6192VA;
        this.A07 = c5734Ng;
        this.A0B = interfaceC6406Yh;
    }

    public C6580bV(C6902gi c6902gi, String str, C6847fp c6847fp, C6365Y2 c6365y2, InterfaceC6192VA interfaceC6192VA, C5734Ng c5734Ng, InterfaceC6406Yh interfaceC6406Yh, InterfaceC6344Xh interfaceC6344Xh) {
        this.A0E = true;
        this.A08 = c6902gi;
        this.A0D = str;
        this.A0C = c6847fp;
        this.A0A = c6365y2;
        this.A09 = interfaceC6192VA;
        this.A07 = c5734Ng;
        this.A0B = interfaceC6406Yh;
        this.A04 = interfaceC6344Xh;
    }

    private EnumC5683Mq A00(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 33);
        EnumC5683Mq actionOutcome = EnumC5683Mq.A09;
        try {
            AbstractC6374YB.A0c(map, this.A02);
            Uri uriA00 = AbstractC6312XB.A00(str2);
            if (this.A01 == null) {
                this.A01 = C5687Mu.A01(this.A08, this.A09, str, uriA00, new C6558b9(map).A03(this.A0C).A02(this.A0A).A05(), true, this.A06, this.A07);
                A02();
            }
            if (this.A01 instanceof C479287) {
                ((C479287) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A06 && (this.A01 instanceof C479085)) {
                    actionOutcome = EnumC5683Mq.A08;
                }
            }
            if (!(((this.A01 instanceof C478984) || (this.A01 instanceof C479287)) && AbstractC6374YB.A0i(this.A08, actionOutcome, map)) && actionOutcome != EnumC5683Mq.A06) {
                if (this.A05 != null) {
                    this.A05.ADY();
                }
                this.A0B.A4j(this.A0D);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(strA01, A01(44, 20, 68) + str2, e);
        } catch (Exception e2) {
            Log.e(strA01, A01(22, 22, 27), e2);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C6902gi c6902gi) {
        boolean zA2w = C6171Up.A2w(c6902gi);
        int iA07 = C6171Up.A07(c6902gi);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0F;
        if (zA2w && A0F > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final EnumC5683Mq A05(String str, String str2, Map<String, String> extraData) {
        EnumC5683Mq enumC5683MqA00 = EnumC5683Mq.A09;
        new C6200VI(str, this.A09).A04(EnumC6199VH.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AB6(str, extraData);
        } else {
            enumC5683MqA00 = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A29().A0L() != null && this.A04 != null) {
                AbstractC6319XI.A07(this.A08.A02(), this.A02.A29().A0L(), this.A04);
            }
        }
        return enumC5683MqA00;
    }

    public final InterfaceC5684Mr A06() {
        if (this.A01 != null) {
            InterfaceC5684Mr interfaceC5684MrA0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return interfaceC5684MrA0E;
        }
        return null;
    }

    public final void A07(InterfaceC5684Mr interfaceC5684Mr) {
        this.A00 = interfaceC5684Mr;
        A02();
    }

    public final void A08(AbstractC7077jd abstractC7077jd) {
        this.A02 = abstractC7077jd;
    }

    public final void A09(C6329XS c6329xs) {
        this.A03 = c6329xs;
    }

    public final void A0A(InterfaceC6344Xh interfaceC6344Xh) {
        this.A04 = interfaceC6344Xh;
    }

    public final void A0B(InterfaceC6579bU interfaceC6579bU) {
        this.A05 = interfaceC6579bU;
    }

    public final void A0C(boolean z) {
        this.A06 = z;
    }
}
