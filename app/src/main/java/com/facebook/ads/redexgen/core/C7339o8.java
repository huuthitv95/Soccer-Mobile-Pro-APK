package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7339o8 implements InterfaceC4987BY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.f22490CR, Ascii.ESC, Ascii.f22494GS, Ascii.f22503VT, Ascii.f22492FF, Ascii.ESC, 83, Ascii.f22500SO, Ascii.DC2, Ascii.f22502US, 7, Ascii.f22493FS, Ascii.f22502US, Ascii.f22494GS, Ascii.NAK, 10, Ascii.NAK, Ascii.CAN, Ascii.f22491EM, 19, 83, Ascii.f22494GS, 10, Ascii.f22502US};
    }

    public C7339o8() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4987BY
    public final int A7P() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4987BY
    public final MediaCodecInfo A7Q(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4987BY
    public final boolean AAR(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4987BY
    public final boolean AAS(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE).equals(str) && A00(15, 9, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE).equals(str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4987BY
    public final boolean AJ4() {
        return false;
    }
}
