package com.facebook.ads.redexgen.core;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.B3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4956B3 {
    public static byte[] A0B;
    public static String[] A0C = {"I9JaO4heFf5nDgSUvVeAxAeOAdbY1nhs", "PVSEhsxK0zpzpXeziFZITHKDYbLYMlXw", "qlK6yxEC", "9zKWhcki2UyQZLYGzaAyWcMw08QqvpbN", "JlMwKIWIzkUyHhMRK", "e8OveLjqyhc2hkEtyY01o7K", "DY1oAH7PrQgT6IVPSHYZAZf9F8l8uJ13", "bCAM9BCoFLqZyqtmC8leb"};
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0B = new byte[]{73, Ascii.f22494GS, 6, 73, Ascii.f22494GS, 17, 65, 77, 54, 46, 48, 2, 2, 4, Ascii.f22493FS, Ascii.DC4, Ascii.NAK, 60, Ascii.DLE, 9, 50, Ascii.f22491EM, Ascii.DLE, Ascii.f22502US, Ascii.f22502US, Ascii.DC4, Ascii.f22494GS, 48, Ascii.NAK, Ascii.ESC, 4, 2, 5, Ascii.f22493FS, Ascii.DC4, Ascii.f22502US, 5, 75, 81, Ascii.f22500SO, 60, 60, 58, 34, 42, 43, Ascii.f22493FS, 58, 63, 63, 32, Base64.padSymbol, 59, 111, Ascii.DC4, 19, 58, 49, 48, 41, 48, 127, Ascii.f22503VT, Ascii.f22494GS, 114, 7, 105, 111, 106, 98, 75, SignedBytes.MAX_POWER_OF_TWO, 65, 88, 65, Ascii.f22500SO, 122, 108, 3, 118, Ascii.CAN, Ascii.f22498RS, Ascii.CAN, 86, 127, 116, 117, 108, 117, 58, 78, 88, 55, 66, 44, 43, 44, 52, Ascii.f22493FS, Ascii.f22494GS, Ascii.DLE, Ascii.CAN, 58, Ascii.SYN, Ascii.f22494GS, Ascii.f22493FS, Ascii.SUB, 48, Ascii.ETB, Ascii.f22502US, Ascii.SYN, Ascii.f22493FS, 55, 42, 39, 33, 114, 99, 98, 126, 95, 99, 69, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 95, 66, 68, Ascii.DLE, 107, Ascii.f22503VT, 0, Ascii.SYN, Ascii.f22503VT, Ascii.f22490CR, 0, 105, Ascii.f22493FS, 17, 119, 32, 34, 55, 65, 42, Ascii.ETB, Ascii.SYN, 1, 0, Ascii.f22493FS, 65, 46, 57, 44, 65, 43, 10, Ascii.f22492FF, 0, Ascii.f22503VT, 10, Ascii.f22494GS, Ascii.f22502US, Ascii.f22494GS, 8, 126, Ascii.NAK, 40, 41, 62, 63, 35, 126, 17, 6, 19, 126, Ascii.DC4, 53, 51, 63, 52, 53, 34, 126, 35, 53, 51, 37, 34, 53, 84, 86, 67, 53, 86, 90, 73, 77, 94, 87, 87, 53, 77, 82, 95, 94, 84, 53, 83, 76, 53, 88, 84, 95, 90, 44, 46, 47, 41, 95, 94, 88, 84, 95, 94, 73, Ascii.f22503VT, 9, Ascii.f22493FS, 106, 9, Ascii.DLE, Ascii.f22499SI, 106, Ascii.DC2, Ascii.f22490CR, 0, 1, Ascii.f22503VT, 106, 0, 1, 7, Ascii.f22503VT, 0, 1, Ascii.SYN, 106, Ascii.f22492FF, 1, Ascii.DC2, 7, Ascii.DLE, Ascii.f22500SO, 110, Ascii.ETB, 113, 112, 115, Ascii.f22499SI, 102, Ascii.ESC, 96, 90, 95, 90, 75, 79, 82, 77, 94, Ascii.SYN, 75, 87, 90, 66, 89, 90, 88, 80, Ascii.f22494GS, 9, Ascii.CAN, Ascii.NAK, 19, 83, 79, Ascii.ESC, Ascii.f22492FF, Ascii.f22492FF, 74, 94, 79, 66, 68, 4, 74, 72, Ascii.CAN, 110, 122, 107, 102, 96, 32, 110, 98, 125, 34, 120, 109, 44, 56, 41, 36, 34, 98, 40, 44, 46, 126, 7, 19, 2, Ascii.f22499SI, 9, 73, 0, 10, 7, 5, 127, 107, 122, 119, 113, 49, 121, 41, 47, 47, 51, 127, 114, 127, 105, 42, 62, 47, 34, 36, 100, 44, 124, 122, 122, 102, 38, 39, 42, 60, Ascii.CAN, Ascii.f22492FF, Ascii.f22494GS, Ascii.DLE, Ascii.SYN, 86, Ascii.f22498RS, 10, Ascii.DC4, 78, 90, 75, 70, SignedBytes.MAX_POWER_OF_TWO, 0, 66, 95, Ascii.ESC, 78, 2, 67, 78, 91, 66, 85, 65, 80, 93, 91, Ascii.ESC, 89, 68, 81, 83, 79, 91, 74, 71, 65, 1, 65, 94, 91, 93, 84, SignedBytes.MAX_POWER_OF_TWO, 81, 92, 90, Ascii.SUB, 71, 84, 66, 111, 123, 106, 103, 97, 33, 120, 97, 124, 108, 103, 125, 126, 115, 110, 121, 125, 112, 5, Ascii.f22500SO, 7, 8, 8, 3, 10, 37, 9, 19, 8, Ascii.DC2, 72, 7, 37, 7, Ascii.SYN, Ascii.NAK, 66, 73, SignedBytes.MAX_POWER_OF_TWO, 79, 79, 68, 77, 98, 78, 84, 79, 85, Ascii.f22499SI, 66, SignedBytes.MAX_POWER_OF_TWO, 81, 82, 55, 60, 53, 58, 58, 49, 56, Ascii.ETB, 59, 33, 58, 32, 122, 39, 33, 36, 36, 59, 38, 32, 120, 116, 53, 57, 50, 51, 53, 120, 59, 63, 59, 51, 118, 107, 103, 108, 109, 107, 38, 120, 122, 103, 110, 97, 100, 109, 68, 109, 126, 109, 100, 36, 40, 126, 114, 97, 127, 122, 125, 36, 42, 63, 124, 40, 87, 69, 70, 86, 77, 74, 69, 77, 95, 87, 82, 88, 87, 77, 86, 49, 35, 47, 50, 46, 39, Ascii.DLE, 35, 54, 39, 108, 35, 1, 35, 50, 49, 109, 127, 115, 110, 114, 123, 76, 127, 106, 123, 48, 125, 127, 110, 109, 2, Ascii.DLE, Ascii.f22493FS, 1, Ascii.f22494GS, Ascii.DC4, 35, Ascii.DLE, 5, Ascii.DC4, 95, 2, 4, 1, 1, Ascii.f22498RS, 3, 5, 93, 81, 1, Ascii.ETB, 17, 7, 0, Ascii.ETB, 95, 2, Ascii.f22498RS, 19, Ascii.f22503VT, Ascii.DLE, 19, 17, Ascii.f22491EM, 102, 124, 111, 112, 84, 123, 113, 71, 116, 97, 112, 59, 118, 116, 101, 102, SignedBytes.MAX_POWER_OF_TWO, 90, 73, 86, 114, 93, 87, 97, 82, 71, 86, Ascii.f22494GS, 80, 92, 69, 86, 65, Ascii.f22502US, 19, 108, 118, 101, 122, 94, 113, 123, 77, 126, 107, 122, 49, 109, 112, 107, 126, 107, 122, 123, 51, 63, Ascii.CAN, 2, 17, Ascii.f22500SO, 42, 5, Ascii.f22499SI, 57, 10, Ascii.f22502US, Ascii.f22500SO, 69, Ascii.CAN, Ascii.f22498RS, Ascii.ESC, Ascii.ESC, 4, Ascii.f22491EM, Ascii.f22502US, 71, 75, 100, 126, 109, 114, 86, 121, 115, 69, 118, 99, 114, 57, 97, 84, 118, 103, 100, 4, 5, Ascii.f22498RS, Ascii.f22498RS, Ascii.NAK, Ascii.f22493FS, Ascii.NAK, Ascii.DC4, 93, 0, Ascii.f22493FS, 17, 9, Ascii.DC2, 17, 19, Ascii.ESC, 48, 47, 34, 35, 41, 105, 39, 48, 37, 114, 109, 96, 97, 107, 43, 96, 107, 104, 102, 125, 41, 114, 109, 119, 109, 107, 106, Ascii.NAK, 10, 7, 6, Ascii.f22492FF, 76, Ascii.f22503VT, 6, Ascii.NAK, 0, 82, 77, SignedBytes.MAX_POWER_OF_TWO, 65, 75, Ascii.f22503VT, 92, 9, 82, 74, SignedBytes.MAX_POWER_OF_TWO, 10, 75, 74, Ascii.SYN, 10, 82, 84, Ascii.f22494GS, 92};
    }

    static {
        A04();
    }

    public C4956B3(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = (String) AbstractC45353y.A01(str);
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A05 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A04 = z4;
        this.A08 = z5;
        this.A06 = z6;
        this.A0A = AbstractC44953J.A0F(str2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0172  */
    /* JADX WARN: Code duplicated, block: B:47:0x0182  */
    /* JADX WARN: Code duplicated, block: B:48:0x0185  */
    public static int A00(String str, String str2, int i) {
        int i2;
        if (i <= 1 && ((AbstractC46115C.A02 < 26 || i <= 0) && !A03(386, 10, 46).equals(str2) && !A03(281, 10, 102).equals(str2) && !A03(300, 12, 21).equals(str2) && !A03(371, 15, 53).equals(str2) && !A03(TTAdConstant.VIDEO_COVER_URL_CODE, 12, 20).equals(str2) && !A03(396, 10, 52).equals(str2))) {
            String strA03 = A03(406, 9, 47);
            String[] strArr = A0C;
            if (strArr[6].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[7] = "P3L7eJR7rcEs8Hcud8b0q";
            strArr2[5] = "gztvffw6orscNCYhET6gtHo";
            if (!strA03.equals(str2) && !A03(322, 10, 124).equals(str2)) {
                if (A0C[0].charAt(21) != 'A') {
                    if (!A03(332, 15, 4).equals(str2)) {
                        if (!A03(347, 15, 81).equals(str2) && !A03(362, 9, 99).equals(str2)) {
                            if (A03(291, 9, 49).equals(str2)) {
                                i2 = 6;
                            } else if (A03(312, 10, 87).equals(str2)) {
                                i2 = 16;
                            } else {
                                i2 = 30;
                            }
                            AbstractC45794g.A07(A03(97, 14, 99), A03(10, 29, 107) + str + A03(6, 3, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + i + A03(0, 4, 115) + i2 + A03(260, 1, 72));
                            return i2;
                        }
                    }
                } else {
                    String[] strArr3 = A0C;
                    strArr3[6] = "8EyIo3AmLznCqcE1QD1Y0pSK088XgXR2";
                    strArr3[3] = "dhhtuZGj1yFwqgsK2BE3ZfBkQ801LDWI";
                    if (!A03(332, 15, 4).equals(str2)) {
                        if (!A03(347, 15, 81).equals(str2)) {
                            if (A03(291, 9, 49).equals(str2)) {
                                i2 = 6;
                            } else if (A03(312, 10, 87).equals(str2)) {
                                i2 = 16;
                            } else {
                                i2 = 30;
                            }
                            AbstractC45794g.A07(A03(97, 14, 99), A03(10, 29, 107) + str + A03(6, 3, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + i + A03(0, 4, 115) + i2 + A03(260, 1, 72));
                            return i2;
                        }
                    }
                }
            }
        }
        return i;
    }

    public static Point A01(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int heightAlignment = videoCapabilities.getWidthAlignment();
        int widthAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC46115C.A05(i, heightAlignment) * heightAlignment, AbstractC46115C.A05(i2, widthAlignment) * widthAlignment);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public static C4956B3 A02(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (!z4 && codecCapabilities != null) {
            boolean zA09 = A09(codecCapabilities);
            if (A0C[2].length() != 8) {
                throw new RuntimeException();
            }
            A0C[2] = "xqlBNWNY";
            if (!zA09 || A0J(str)) {
                z6 = false;
            } else {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        return new C4956B3(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities != null && A0D(codecCapabilities), z5 || (codecCapabilities != null && A0B(codecCapabilities)));
    }

    private void A05(String str) {
        StringBuilder sbAppend = new StringBuilder().append(A03(39, 16, 85)).append(str);
        String strA03 = A03(261, 3, 33);
        AbstractC45794g.A04(A03(97, 14, 99), sbAppend.append(strA03).append(this.A03).append(A03(4, 2, 43)).append(this.A02).append(strA03).append(AbstractC46115C.A04).append(A03(260, 1, 72)).toString());
    }

    private void A06(String str) {
        StringBuilder sbAppend = new StringBuilder().append(A03(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 11, 42)).append(str);
        String strA03 = A03(261, 3, 33);
        AbstractC45794g.A04(A03(97, 14, 99), sbAppend.append(strA03).append(this.A03).append(A03(4, 2, 43)).append(this.A02).append(strA03).append(AbstractC46115C.A04).append(A03(260, 1, 72)).toString());
    }

    public static boolean A07() {
        return AbstractC46115C.A03.equals(A03(532, 7, 62)) || AbstractC46115C.A03.equals(A03(427, 6, 6)) || AbstractC46115C.A06.startsWith(A03(55, 14, 69)) || AbstractC46115C.A06.startsWith(A03(69, 14, 52)) || AbstractC46115C.A06.startsWith(A03(83, 14, 0));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC46115C.A02 >= 19 && A0A(codecCapabilities);
    }

    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(264, 17, 33));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC46115C.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(598, 15, 104));
    }

    public static boolean A0D(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC46115C.A02 >= 21 && A0E(codecCapabilities);
    }

    public static boolean A0E(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(707, 17, 106));
    }

    public static boolean A0F(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point alignedSize = A01(videoCapabilities, i, i2);
        int i3 = alignedSize.x;
        int i4 = alignedSize.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0111 A[SYNTHETIC] */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D46258033: [FBLite][Video] Solve tasks T154141530 T154151746 gating the call for SDK >=21")
    private boolean A0G(C7472qI c7472qI, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA0V;
        int i;
        int i2;
        boolean zA0L;
        Pair<Integer, Integer> pairA0B = C4989Ba.A0B(c7472qI);
        if (pairA0B == null) {
            return true;
        }
        Integer num = (Integer) pairA0B.first;
        String[] strArr = A0C;
        if (strArr[6].charAt(25) == strArr[3].charAt(25)) {
            A0C[2] = "XFIr8RM8";
            int iIntValue = num.intValue();
            int level = ((Integer) pairA0B.second).intValue();
            if (A03(733, 18, 30).equals(c7472qI.A0W)) {
                if (A03(724, 9, 92).equals(this.A02)) {
                    iIntValue = 8;
                    level = 0;
                } else if (A03(751, 10, Sdk.SDKError.Reason.TPAT_ERROR_VALUE).equals(this.A02)) {
                    iIntValue = 2;
                    level = 0;
                }
            }
            if (this.A0A) {
                if (A0V().length <= 0) {
                    return true;
                }
                codecProfileLevelArrA0V = A0V();
                if (AbstractC46115C.A02 >= 21 && AbstractC46115C.A02 <= 23) {
                    if (A03(761, 19, 62).equals(this.A02) && codecProfileLevelArrA0V.length == 0) {
                        codecProfileLevelArrA0V = A0M(this.A00);
                    }
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrA0V) {
                    if (codecProfileLevel.profile == iIntValue) {
                        i2 = codecProfileLevel.level;
                        if (A0C[0].charAt(21) != 'A') {
                            A0C[1] = "Tk1KZqXmKjuSsbjIU3mgahSyAhYoMHEk";
                            if (i2 < level || !z) {
                                zA0L = A0L(this.A02, iIntValue);
                                if (A0C[1].charAt(21) != 'k') {
                                    A0C[0] = "B6qJQnb2cEtex6AQnXMJ6AJyRiBsPuck";
                                    if (!zA0L) {
                                        return true;
                                    }
                                } else if (!zA0L) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                A06(A03(501, 20, 18) + c7472qI.A0R + A03(4, 2, 43) + this.A01);
                return false;
            }
            if (A0C[2].length() == 8) {
                A0C[4] = "U7uwaC6XnAT7ItuO5";
                if (iIntValue != 42) {
                    return true;
                }
                if (A0V().length <= 0) {
                    return true;
                }
                codecProfileLevelArrA0V = A0V();
                if (AbstractC46115C.A02 >= 21) {
                    if (A03(761, 19, 62).equals(this.A02)) {
                        codecProfileLevelArrA0V = A0M(this.A00);
                    }
                }
                while (i < r6) {
                    if (codecProfileLevel.profile == iIntValue) {
                        i2 = codecProfileLevel.level;
                        if (A0C[0].charAt(21) != 'A') {
                            A0C[1] = "Tk1KZqXmKjuSsbjIU3mgahSyAhYoMHEk";
                            if (i2 < level) {
                                zA0L = A0L(this.A02, iIntValue);
                                if (A0C[1].charAt(21) != 'k') {
                                    A0C[0] = "B6qJQnb2cEtex6AQnXMJ6AJyRiBsPuck";
                                    if (!zA0L) {
                                        return true;
                                    }
                                } else if (!zA0L) {
                                    return true;
                                }
                            } else {
                                zA0L = A0L(this.A02, iIntValue);
                                if (A0C[1].charAt(21) != 'k') {
                                    A0C[0] = "B6qJQnb2cEtex6AQnXMJ6AJyRiBsPuck";
                                    if (!zA0L) {
                                        return true;
                                    }
                                } else if (!zA0L) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                A06(A03(501, 20, 18) + c7472qI.A0R + A03(4, 2, 43) + this.A01);
                return false;
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0H(String str) {
        return A03(396, 10, 52).equals(str);
    }

    public static boolean A0I(String str) {
        return AbstractC46115C.A06.startsWith(A03(253, 7, 89)) && A03(191, 36, 1).equals(str);
    }

    public static boolean A0J(String str) {
        if (AbstractC46115C.A02 <= 22) {
            if ((A03(130, 10, 94).equals(AbstractC46115C.A06) || A03(111, 8, 72).equals(AbstractC46115C.A06)) && (A03(140, 22, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE).equals(str) || A03(162, 29, 74).equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0K(String str) {
        if (A03(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 26, 94).equals(str) && A03(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 5, 83).equals(AbstractC46115C.A03)) {
            return false;
        }
        return true;
    }

    public static boolean A0L(String str, int i) {
        if (A03(751, 10, Sdk.SDKError.Reason.TPAT_ERROR_VALUE).equals(str) && 2 == i) {
            if (A03(539, 8, 36).equals(AbstractC46115C.A03) || A03(521, 6, 9).equals(AbstractC46115C.A03)) {
                return true;
            }
        }
        return false;
    }

    public static MediaCodecInfo.CodecProfileLevel[] A0M(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int level;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = 0;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            Integer num = (Integer) videoCapabilities.getBitrateRange().getUpper();
            if (A0C[0].charAt(21) != 'A') {
                throw new RuntimeException();
            }
            A0C[0] = "QcEMGW7v0Yxqh7XLcQ4xIAQDDerowqhX";
            iIntValue = num.intValue();
        }
        if (iIntValue >= 180000000) {
            level = 1024;
        } else if (iIntValue >= 120000000) {
            level = 512;
        } else if (iIntValue >= 60000000) {
            level = 256;
        } else if (iIntValue >= 30000000) {
            level = 128;
        } else if (iIntValue >= 18000000) {
            level = 64;
        } else {
            if (A0C[0].charAt(21) != 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[7] = "cnj1P9QIvdvvlmM3jq4NJ";
            strArr[5] = "0LKKsHUxH9Ew65kXLPhVQ5r";
            if (iIntValue >= 12000000) {
                level = 32;
            } else if (iIntValue >= 7200000) {
                level = 16;
            } else if (iIntValue >= 3600000) {
                level = 8;
            } else if (iIntValue >= 1800000) {
                level = 4;
            } else if (iIntValue >= 800000) {
                level = 2;
            } else {
                level = 1;
            }
        }
        MediaCodecInfo.CodecProfileLevel profileLevel = new MediaCodecInfo.CodecProfileLevel();
        profileLevel.profile = 1;
        profileLevel.level = level;
        return new MediaCodecInfo.CodecProfileLevel[]{profileLevel};
    }

    public final Point A0N(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.A00 == null || (videoCapabilities = this.A00.getVideoCapabilities()) == null) {
            return null;
        }
        return A01(videoCapabilities, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public final C46826L A0O(C7472qI c7472qI, C7472qI c7472qI2) {
        int i = AbstractC46115C.A1E(c7472qI.A0W, c7472qI2.A0W) ? 0 : 0 | 8;
        if (this.A0A) {
            int discardReasons = c7472qI.A0F;
            if (discardReasons != c7472qI2.A0F) {
                i |= 1024;
            }
            if (!this.A04) {
                int discardReasons2 = c7472qI.A0L;
                if (discardReasons2 == c7472qI2.A0L) {
                    int discardReasons3 = c7472qI.A0A;
                    if (discardReasons3 != c7472qI2.A0A) {
                        i |= 512;
                    }
                } else {
                    i |= 512;
                }
            }
            if (!AbstractC46115C.A1E(c7472qI.A0N, c7472qI2.A0N)) {
                i |= 2048;
            }
            if (A0I(this.A03) && !c7472qI.A0A(c7472qI2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.A03;
                int i2 = c7472qI.A0A(c7472qI2) ? 3 : 2;
                if (A0C[0].charAt(21) != 'A') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[7] = "2o9LDR7wht3djkkWSozFp";
                strArr[5] = "xzNY8imEyNfCiAqEOIotcML";
                return new C46826L(str, c7472qI, c7472qI2, i2, 0);
            }
        } else {
            int discardReasons4 = c7472qI.A06;
            if (discardReasons4 != c7472qI2.A06) {
                i |= 4096;
            }
            int discardReasons5 = c7472qI.A0G;
            if (discardReasons5 != c7472qI2.A0G) {
                i |= 8192;
            }
            int discardReasons6 = c7472qI.A0C;
            if (discardReasons6 != c7472qI2.A0C) {
                i |= 16384;
            }
            if (i == 0 && A03(371, 15, 53).equals(this.A02)) {
                Pair<Integer, Integer> pairA0B = C4989Ba.A0B(c7472qI);
                Pair<Integer, Integer> pairA0B2 = C4989Ba.A0B(c7472qI2);
                if (pairA0B != null && pairA0B2 != null) {
                    int iIntValue = ((Integer) pairA0B.first).intValue();
                    int iIntValue2 = ((Integer) pairA0B2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C46826L(this.A03, c7472qI, c7472qI2, 3, 0);
                    }
                }
            }
            if (!c7472qI.A0A(c7472qI2)) {
                i |= 32;
            }
            if (A0H(this.A02)) {
                i |= 2;
            }
            if (i == 0) {
                return new C46826L(this.A03, c7472qI, c7472qI2, 1, 0);
            }
        }
        return new C46826L(this.A03, c7472qI, c7472qI2, 0, i);
    }

    public final boolean A0P(int i) {
        if (this.A00 == null) {
            A06(A03(451, 17, 59));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(433, 18, 124));
            return false;
        }
        if (A00(this.A03, this.A02, audioCapabilities.getMaxInputChannelCount()) < i) {
            A06(A03(468, 22, 78) + i);
            return false;
        }
        return true;
    }

    public final boolean A0Q(int i) {
        if (this.A00 == null) {
            A06(A03(563, 15, 4));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(547, 16, 88));
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i)) {
            A06(A03(578, 20, 107) + i);
            return false;
        }
        return true;
    }

    public final boolean A0R(int i, int i2, double d) {
        if (this.A00 == null) {
            if (A0C[4].length() != 17) {
                throw new RuntimeException();
            }
            A0C[1] = "VtsIfpRARdWM2RcSD8UT7BsOJP98i2Mb";
            A06(A03(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 16, 15));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(690, 17, 13));
            return false;
        }
        int i3 = AbstractC46115C.A02;
        String strA03 = A03(9, 1, 116);
        String strA04 = A03(780, 1, 62);
        if (i3 >= 29) {
            int iA00 = C4954B1.A00(videoCapabilities, i, i2, d);
            if (iA00 == 2) {
                return true;
            }
            if (iA00 == 1) {
                A06(A03(LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 19, 41) + i + strA04 + i2 + strA03 + d);
                return false;
            }
        }
        if (!A0F(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !A0K(this.A03) || !A0F(videoCapabilities, i2, i, d)) {
                A06(A03(669, 21, 113) + i + strA04 + i2 + strA03 + d);
                return false;
            }
            A05(A03(648, 21, 5) + i + strA04 + i2 + strA03 + d);
        }
        return true;
    }

    @MetaExoPlayerCustomization(type = {"DEPRECATED_LOGIC"}, value = "D51676338: Control Renderer Support behavior")
    public final boolean A0S(C7472qI c7472qI) {
        String strA07;
        if (c7472qI.A0R == null || this.A02 == null || (strA07 = AbstractC44953J.A07(c7472qI.A0R)) == null) {
            return true;
        }
        String codecMimeType = this.A02;
        if (!codecMimeType.equals(strA07)) {
            StringBuilder sb = new StringBuilder();
            String codecMimeType2 = A03(490, 11, 76);
            StringBuilder sbAppend = sb.append(codecMimeType2);
            String codecMimeType3 = c7472qI.A0R;
            StringBuilder sbAppend2 = sbAppend.append(codecMimeType3);
            String codecMimeType4 = A03(4, 2, 43);
            A06(sbAppend2.append(codecMimeType4).append(strA07).toString());
            return false;
        }
        return A0G(c7472qI, true);
    }

    public final boolean A0T(C7472qI c7472qI) {
        if (this.A0A) {
            boolean z = this.A04;
            if (A0C[1].charAt(21) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[7] = "p6ujkjtFWGTlktsjRzxuv";
            strArr[5] = "iao6hIdGkkUEjHJmkTON0Ul";
            return z;
        }
        Pair<Integer, Integer> profileLevel = C4989Ba.A0B(c7472qI);
        return profileLevel != null && ((Integer) profileLevel.first).intValue() == 42;
    }

    @Deprecated
    public final boolean A0U(C7472qI c7472qI, C7472qI c7472qI2, boolean z) {
        if (!z && c7472qI.A0N != null) {
            ColorInfo colorInfo = c7472qI2.A0N;
            String[] strArr = A0C;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "CiueF8sE";
            if (colorInfo == null) {
                c7472qI2 = c7472qI2.A07().A0t(c7472qI.A0N).A14();
            }
        }
        int i = A0O(c7472qI, c7472qI2).A01;
        return i == 2 || i == 3;
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0V() {
        if (this.A00 == null || this.A00.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (A0C[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[7] = "wYBsKMorArWFj72U1vIrO";
        strArr[5] = "2GYgXVRgmEsc3DaR9LQ86J2";
        return codecCapabilities.profileLevels;
    }

    public final String toString() {
        return this.A03;
    }
}
