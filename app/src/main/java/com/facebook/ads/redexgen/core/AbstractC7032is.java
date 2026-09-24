package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.is */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7032is {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{39, 0, 8, Ascii.f22490CR, 4, 5, 65, Ascii.NAK, Ascii.f22500SO, 65, 19, 4, Ascii.NAK, 19, 8, 4, Ascii.ETB, 4, 65, 44, 4, 5, 8, 0, 39, Ascii.f22500SO, 19, Ascii.f22492FF, 0, Ascii.NAK, 73, 100, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, 43, 54, 33, 32, 116, 10, 45, 56, 45, 44, 42, 126, 72, 89, Ascii.f22490CR, 108, 100, Ascii.f22490CR, 107, 127, 110, Ascii.f22490CR, 124, 107, 105, Ascii.f22490CR, 65, 72, 91, 72, 65, Ascii.f22490CR, 89, 66, Ascii.f22490CR, 8, 73, 59, Ascii.f22490CR, Ascii.f22493FS, 72, 41, 33, 72, 46, 58, 43, 72, Ascii.SUB, Ascii.f22490CR, Ascii.f22491EM, Ascii.f22494GS, Ascii.f22490CR, Ascii.ESC, Ascii.f22493FS, 72, Ascii.f22493FS, 7, 72, 89, Ascii.f22492FF, 58, 43, 127, Ascii.f22498RS, Ascii.SYN, 127, Ascii.f22491EM, Ascii.f22490CR, Ascii.f22493FS, 127, 41, 54, 59, 58, 48, 127, 59, 42, 45, 62, 43, 54, 48, 49, 127, 43, 48, 127, 122, 59, 37, 40, 36, 42, 37, 57, 19, Ascii.f22500SO, 10, 2, 8, Ascii.DC2, 19, 56, 19, Ascii.NAK, Ascii.f22498RS, Ascii.f22500SO, 9, 0, 56, 19, 8, 56, 1, Ascii.f22500SO, 9, 3, 56, Ascii.DC4, 2, 0, 10, 2, 9, 19, 56, Ascii.f22500SO, 9, 56, 8, Ascii.f22500SO, Ascii.f22503VT, Ascii.f22499SI, Ascii.f22493FS, Ascii.ETB, Ascii.f22494GS, Ascii.SYN, Ascii.f22503VT, 87, 10, Ascii.f22493FS, Ascii.SUB, 84, Ascii.CAN, Ascii.DLE, Ascii.f22502US, Ascii.f22503VT, Ascii.SUB, 84, Ascii.f22490CR, Ascii.f22503VT, Ascii.CAN, Ascii.ETB, 10, Ascii.f22502US, Ascii.f22493FS, Ascii.f22503VT, 84, Ascii.f22503VT, Ascii.f22493FS, 8, Ascii.f22492FF, Ascii.f22493FS, 10, Ascii.f22490CR, 87, Ascii.f22499SI, Ascii.CAN, Ascii.NAK, Ascii.f22492FF, Ascii.f22493FS, 112, 99, 104, 98, 105, 116, 40, 117, 99, 101, 43, 103, 111, 96, 116, 101, 43, 112, 111, 98, 99, 105, 43, 98, 115, 116, 103, 114, 111, 105, 104, 40, 112, 103, 106, 115, 99, 78, 93, 86, 92, 87, 74, Ascii.SYN, 75, 93, 91, Ascii.NAK, 89, 81, 94, 74, 91, Ascii.NAK, 78, 81, 92, 93, 87, Ascii.NAK, 73, 94, 92, Ascii.NAK, 84, 93, 78, 93, 84, Ascii.SYN, 78, 89, 84, 77, 93, 89, 71, 74, 90, 70};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(TsExtractor.TS_STREAM_TYPE_DTS_UHD, 37, 109);
        A03 = new Random();
    }

    public static int A00(int i, int i2) {
        if (i2 != 0) {
            return (int) ((Math.pow(2.0d, i - 1) * ((double) i2) * 1000.0d) + ((double) A03.nextInt(2000)));
        }
        return (int) Math.min((((long) (i - 1)) * 1000) + 500, 5000L);
    }

    public static void A03(C7066jQ c7066jQ, MediaFormat mediaFormat) {
        String strA01 = A01(0, 30, 107);
        String strA02 = A01(30, 11, 11);
        if (!c7066jQ.A01) {
            return;
        }
        try {
            if (C7030iq.A02()) {
                if (c7066jQ.A0P && !C7030iq.A03(mediaFormat.getInteger(A01(290, 5, 36)), mediaFormat.getInteger(A01(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 6, 71)))) {
                    return;
                }
                long j = c7066jQ.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 37, 12), j);
                    AbstractC6959hd.A01(strA02, A01(102, 31, 85), Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(252, 38, 50), c7066jQ.A02);
                AbstractC6959hd.A01(strA02, A01(53, 26, 39), Integer.valueOf(c7066jQ.A02));
                mediaFormat.setInteger(A01(176, 39, 115), 1);
                AbstractC6959hd.A00(strA02, A01(79, 23, 98));
            }
        } catch (ClassCastException e) {
            AbstractC6959hd.A02(strA02, strA01, e);
        } catch (NullPointerException e2) {
            AbstractC6959hd.A02(strA02, strA01, e2);
        }
    }

    public static boolean A04(C7066jQ c7066jQ, int i, int i2, int i3, int i4) {
        if (c7066jQ.A01 && c7066jQ.A0P && C7030iq.A03(i, i2) != C7030iq.A03(i3, i4)) {
            return true;
        }
        return false;
    }
}
