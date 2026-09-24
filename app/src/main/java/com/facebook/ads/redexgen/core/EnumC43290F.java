package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0F */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class EnumC43290F {
    public static byte[] A00;
    public static String[] A01 = {"1DQLZ1rq4NIZGDZ", "M27x7uLXr8W8z6FBpz", "QiRVHYZbaaQy04eLnAf", "IUWbXisoiWRubDZ2DWGyYlgf", "7fZtGPTC8N131cwHLDb", "WH1t2xD2R2zn", "HR89Gzy0Q3G", "ZYvoohNn3qjMZ9YFxZuTTpCr"};
    public static final /* synthetic */ EnumC43290F[] A02;
    public static final EnumC43290F A03;
    public static final EnumC43290F A04;
    public static final EnumC43290F A05;
    public static final EnumC43290F A06;
    public static final EnumC43290F A07;
    public static final EnumC43290F A08;
    public static final EnumC43290F A09;
    public static final EnumC43290F A0A;
    public static final EnumC43290F A0B;
    public static final EnumC43290F A0C;
    public static final EnumC43290F A0D;
    public static final EnumC43290F A0E;
    public static final EnumC43290F A0F;
    public static final EnumC43290F A0G;
    public static final EnumC43290F A0H;
    public static final EnumC43290F A0I;
    public static final EnumC43290F A0J;
    public static final EnumC43290F A0K;
    public static final EnumC43290F A0L;
    public static final EnumC43290F A0M;
    public static final EnumC43290F A0N;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{1, Ascii.DC2, Ascii.DC2, 1, Ascii.f22491EM, 17, Ascii.f22498RS, Ascii.f22498RS, Ascii.ESC, Ascii.DC4, Ascii.DLE, Ascii.f22494GS, -84, -61, -66, -81, -13, -8, -15, 2, 10, Ascii.f22503VT, 9, Ascii.DC2, 7, Ascii.CAN, Ascii.f22503VT, 10, -100, -89, -83, -102, -92, -99, -65, -52, -52, -55, -52, -14, 5, -14, -16, 2, 1, -18, -17, -7, -14, -63, -57, -54, -68, -49, -17, -12, -6, 2, 7, Ascii.f22490CR, -2, Ascii.f22503VT, Ascii.f22492FF, -2, -4, Ascii.f22490CR, 2, 8, 7, -66, -63, -64, -71, 19, Ascii.DC4, 19, 10, Ascii.DLE, Ascii.ETB, Ascii.f22500SO, Ascii.f22500SO, Ascii.f22493FS, 33, Ascii.NAK, Ascii.DC2, Ascii.f22502US, -32, -47, -45, -37, -47, -41, -43, -70, -81, -74, -71, -69, -36, -31, -40, -51, -34, -55, -38, 35, Ascii.f22493FS, Ascii.ETB, Ascii.f22494GS, Ascii.f22493FS, 19, Ascii.f22492FF, 6, 1, Ascii.f22491EM, Ascii.f22503VT, Ascii.f22500SO, 6, 5, 3, Ascii.DC4, 6};
    }

    static {
        A01();
        A04 = new EnumC43290F(A00(5, 7, 126), 0);
        A05 = new EnumC43290F(A00(12, 4, 25), 1);
        A0J = new EnumC43290F(A00(93, 5, 22), 2);
        A0C = new EnumC43290F(A00(54, 3, 85), 3);
        A0E = new EnumC43290F(A00(69, 4, 33), 4);
        A06 = new EnumC43290F(A00(16, 4, 95), 5);
        A0B = new EnumC43290F(A00(49, 5, 42), 6);
        A08 = new EnumC43290F(A00(28, 6, 7), 7);
        A0M = new EnumC43290F(A00(110, 4, 108), 8);
        A0F = new EnumC43290F(A00(73, 4, 116), 9);
        A0G = new EnumC43290F(A00(77, 4, 113), 10);
        A03 = new EnumC43290F(A00(0, 5, 111), 11);
        A07 = new EnumC43290F(A00(20, 8, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), 12);
        A09 = new EnumC43290F(A00(34, 5, 41), 13);
        A0K = new EnumC43290F(A00(98, 7, 55), 14);
        A0N = new EnumC43290F(A00(114, 8, 113), 15);
        A0I = new EnumC43290F(A00(86, 7, 63), 16);
        A0A = new EnumC43290F(A00(39, 10, 92), 17);
        A0H = new EnumC43290F(A00(81, 5, 124), 18);
        A0L = new EnumC43290F(A00(105, 5, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), 19);
        A0D = new EnumC43290F(A00(57, 12, 104), 20);
        A02 = A02();
    }

    public EnumC43290F(String str, int i) {
        super(str, i);
    }

    public static /* synthetic */ EnumC43290F[] A02() {
        EnumC43290F[] enumC43290FArr = new EnumC43290F[21];
        enumC43290FArr[0] = A04;
        enumC43290FArr[1] = A05;
        enumC43290FArr[2] = A0J;
        enumC43290FArr[3] = A0C;
        enumC43290FArr[4] = A0E;
        enumC43290FArr[5] = A06;
        enumC43290FArr[6] = A0B;
        enumC43290FArr[7] = A08;
        enumC43290FArr[8] = A0M;
        enumC43290FArr[9] = A0F;
        enumC43290FArr[10] = A0G;
        enumC43290FArr[11] = A03;
        enumC43290FArr[12] = A07;
        enumC43290FArr[13] = A09;
        enumC43290FArr[14] = A0K;
        enumC43290FArr[15] = A0N;
        enumC43290FArr[16] = A0I;
        enumC43290FArr[17] = A0A;
        EnumC43290F enumC43290F = A0H;
        String[] strArr = A01;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A01[0] = "Hgmq0BxEPxBnQrs";
        enumC43290FArr[18] = enumC43290F;
        enumC43290FArr[19] = A0L;
        enumC43290FArr[20] = A0D;
        return enumC43290FArr;
    }

    public static EnumC43290F valueOf(String str) {
        return (EnumC43290F) Enum.valueOf(EnumC43290F.class, str);
    }

    public static EnumC43290F[] values() {
        return (EnumC43290F[]) A02.clone();
    }
}
